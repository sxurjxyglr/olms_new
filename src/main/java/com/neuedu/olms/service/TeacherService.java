package com.neuedu.olms.service;



import com.neuedu.olms.po.Teacher;

public interface TeacherService {
	public void addTeacher(Teacher teacher);
	/**
	 * �ж��ֻ����Ƿ��Ѿ�ע��
	 * @param tel
	 * @return
	 */
	public boolean hasTelExists(String tel);
	public Teacher login(String tel,String pwd);
}
