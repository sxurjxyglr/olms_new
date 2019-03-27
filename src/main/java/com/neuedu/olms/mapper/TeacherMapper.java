package com.neuedu.olms.mapper;

import com.neuedu.olms.po.Teacher;

public interface TeacherMapper {
	/**
	 * ��ӽ�ʦ
	 * @param teacher
	 */
	public void add(Teacher teacher);
	public Teacher getTeacherByTel(String tel);
	//����token���ҽ�ʦ��Ϣ
	public Teacher getTeacherByToken(String token);
}
