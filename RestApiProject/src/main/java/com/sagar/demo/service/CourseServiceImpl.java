package com.sagar.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.sagar.demo.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	public  CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(145,"java core course","this course is about core"));
		list.add(new Course(245,"spring boot course","this course is about spring boot"));
		
	}
	
	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCoures(long courseId) {
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		Course c=null;
		for(Course course1:list) {
			if(course1.getId()==course.getId()) {
				course.setTitle(course1.getTitle());
				course.setDescription(course1.getDescription());
			}
		}
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
	}

	

	
}
