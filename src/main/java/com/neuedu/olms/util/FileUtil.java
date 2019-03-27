package com.neuedu.olms.util;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.neuedu.olms.ex.InvalidParamException;
import com.neuedu.olms.web.ExInfo;

public class FileUtil {
	private static String uploadDir = "/upload";

	public static String fileUpload(HttpServletRequest req, MultipartFile file) {
		String path = req.getServletContext().getRealPath(uploadDir);
		//ÅÐ¶ÏÄ¿Â¼ÊÇ·ñ´æÔÚ
		File uploadDirFile=new File(path);
		if(!uploadDirFile.exists()) {
			uploadDirFile.mkdirs();
		}
		String fileName = Long.toHexString(System.currentTimeMillis());
		int index = file.getOriginalFilename().lastIndexOf(".");
		String sufix = file.getOriginalFilename().substring(index);
		try {
			file.transferTo(new File(path + "/" + fileName + sufix));
		} catch (IOException e) {
			e.printStackTrace();
			throw new InvalidParamException(ExInfo.IMG_UPLOAD_ERROR_CODE, ExInfo.IMG_UPLOAD_ERROR_MSG);
		}

		return uploadDir + "/" + fileName + sufix;
	}

}
