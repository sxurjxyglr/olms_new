package com.neuedu.olms.service;

import com.neuedu.olms.po.Course;
import com.neuedu.olms.web.PageData;

public interface CourseService {
	public void add(Course course);
	public PageData<Course> list(String keyword,int pageSize,int curPage);
}
