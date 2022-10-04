package com.sagar.demo.service;

import java.util.List;

import com.sagar.demo.entities.Course;



public interface CourseService {

	public List<Course> getCourse();
	public Course getCoures(long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public void deleteCourse(long parseLong);
}
