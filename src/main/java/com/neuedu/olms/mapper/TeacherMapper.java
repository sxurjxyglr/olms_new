package com.neuedu.olms.mapper;

import com.neuedu.olms.po.Teacher;

public interface TeacherMapper {
	/**
	 * 添加教师
	 * @param teacher
	 */
	public void add(Teacher teacher);
	public Teacher getTeacherByTel(String tel);
	//根据token查找教师信息
	public Teacher getTeacherByToken(String token);
}
