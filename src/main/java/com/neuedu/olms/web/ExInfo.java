package com.neuedu.olms.web;

public class ExInfo {
	//请求成功
	public static final int SUCCESS_CODE = 200;
	public static final String SUCCESS_MSG = "success";
	//请求参数错误
	public static final int PARAM_ERROR_CODE=1000;
	public static final String PARAM_ERROR_MSG="请求参数错误";
	//服务器端错误
	public static final int SERVER_ERROR_CODE=500;
	public static final String SERVER_ERROR_MSG="服务器端错误";
	
	public static final int USER_ACCOUNT_ERROR_CODE=1001;
	public static final String USER_ACCOUNT_ERROR_MSG="用户名或密码错误";
	
	public static final int USER_NO_LOGIN_CODE=1002;
	public static final String USER_NO_LOGIN_MSG="未登录";
	
	public static final int DATA_EXIST_CODE = 1003;
	public static final String DATA_EXIST_MSG = "数据已存在";
	
	public static final int IMG_WRAPPER_ERROR_CODE = 1004;
	public static final String IMG_WRAPPER_ERROR_MSG = "封面图片不能为空";
	
	public static final int IMG_UPLOAD_ERROR_CODE = 1005;
	public static final String IMG_UPLOAD_ERROR_MSG = "文件上传失败";
	
	public static final int NO_COURSE_ERROR_CODE = 1006;
	public static final String NO_COURSE_ERROR_MSG = "课程不存在";
}
