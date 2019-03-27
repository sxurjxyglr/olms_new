package com.neuedu.olms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neuedu.olms.po.Course;


public interface CourseMapper {
	public void add(Course course);
	public int getCourseByKeywordCount(@Param("keyword") String keyword);
	public List<Course> getCourseByKeyword(@Param("keyword")  String keyword,@Param("begin") int begin,@Param("pageSize") int pageSize);
	
}
