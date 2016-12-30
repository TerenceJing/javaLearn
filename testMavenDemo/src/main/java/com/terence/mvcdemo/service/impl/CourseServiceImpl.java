package com.terence.mvcdemo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.terence.mvcdemo.model.Chapter;
import com.terence.mvcdemo.model.Course;
import com.terence.mvcdemo.service.CourseService;


@Service("courseService")
public class CourseServiceImpl implements CourseService {
	public Course getCourseById(Integer courseId)
	{
		Course course=new Course();
		course.setCourseId(courseId);
		course.setTitle("Java多线程");
		course.setImgPath("resources/imgs/course-img.jpg");
		course.setLearningNum(23568);
		course.setLevel(2);
		course.setLevelDesc("中级");
		course.setDuration(7200l);
		course.setDescr("多线程是日常开发中的常用知识，也是难用知识，一定要掌握好。");
		
		List<Chapter> chapterList=new ArrayList<Chapter>();
		wrapChapterList(courseId,chapterList);
		course.setChapterList(chapterList);
		return course;
	}
	public void wrapChapterList(Integer courseId,List<Chapter> chapterList)
	{
		Chapter chapter=new Chapter();
		chapter.setId(1);
		chapter.setCourseId(courseId);
		chapter.setOrder(2);
		chapter.setTitle("第1章 Java多线程背景应用");
		chapter.setDescr("主要介绍一下Java多线程的背景应用，了解背景知识，可以更好的应用的相应的场景中。");
		chapterList.add(chapter);
		
		Chapter chapter1=new Chapter();
		chapter1.setId(1);
		chapter1.setCourseId(courseId);
		chapter1.setOrder(2);
		chapter1.setTitle("第2章 Java线程初体验");
		chapter1.setDescr("Java语言层面对线程的支持，如何创建，启动和停止线程。如何使用常用的线程方法。用隋唐演义作为实例进行解说。");
		chapterList.add(chapter1);
		
		Chapter chapter2=new Chapter();
		chapter2.setId(2);
		chapter2.setCourseId(courseId);
		chapter2.setOrder(3);
		chapter2.setTitle("第3章 Java线程进阶");
		chapter2.setDescr("Java语言层面对线程的支持，简述线程调用的原理核心知识");
		chapterList.add(chapter2);
	}
}
