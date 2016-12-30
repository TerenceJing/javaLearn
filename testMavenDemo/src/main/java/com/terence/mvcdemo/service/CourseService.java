package com.terence.mvcdemo.service;

import org.springframework.stereotype.Service;

import com.terence.mvcdemo.model.Course;

@Service
public interface CourseService {
	Course getCourseById(Integer couseId);
}