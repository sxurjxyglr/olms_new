package com.neuedu.olms.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.neuedu.olms.ex.InvalidParamException;

@RestControllerAdvice
public class ExHandle{
	private static Logger log=Logger.getLogger(ExHandle.class);
   
	@ExceptionHandler(Exception.class)
	public ApiResult exception(Exception e) {
    	e.printStackTrace();
    	ApiResult ars=ApiResult.build();
    	ars.setCode(ExInfo.SERVER_ERROR_CODE);
    	ars.setMsg(ExInfo.SERVER_ERROR_MSG);
    	log.info("返回信息："+ars);
		return ars;
	}
    //
    @ExceptionHandler(BindException.class)
    public ApiResult bindexception(BindException e) {
    	e.printStackTrace();
    	BindingResult bindingResult=e.getBindingResult();
    	Map<String,String> errMap=new HashMap<String,String>();
    	if(bindingResult.hasErrors()) {
			List<ObjectError> errors=bindingResult.getAllErrors();
			for(ObjectError error:errors) {
				FieldError ferror=(FieldError) error;
				errMap.put(ferror.getField(),ferror.getDefaultMessage());
			}
		}
    	ApiResult ars=ApiResult.build();
    	ars.setCode(ExInfo.PARAM_ERROR_CODE);
    	ars.setMsg(ExInfo.PARAM_ERROR_MSG);
    	ars.setData(errMap);
    	log.info("返回信息："+ars);
		return ars;
	}
    @ExceptionHandler(InvalidParamException.class)
    public ApiResult invalidParamException(InvalidParamException e) {
    	ApiResult ars=ApiResult.build();
    	ars.setCode(e.getCode());
    	ars.setMsg(e.getMsg());
    	log.info("返回信息："+ars);
    	return ars;
    	
    }
    @ExceptionHandler(DuplicateKeyException.class)
    public ApiResult violationException(DuplicateKeyException e) {
    	
    	return ApiResult.build().setCode(ExInfo.DATA_EXIST_CODE).setMsg(ExInfo.DATA_EXIST_MSG);
    }
}
