package com.terence.mvcdemo.model;

import java.util.List;

public class Course {
	private Integer courseId; //课程ID
	private String title;//课程标题
	private String imgPath;//课程图片路径
	private Integer learningNum;//学习人数
	private Long duration;//课程时间长
	private Integer level;//课程难度
	private String levelDesc;//课程难度描述
	private List<Chapter> chapterList;//课程提纲
	private String Descr;
	public Course(){}
	
	public Integer getCourseId()
	{
		return courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public Integer getLearningNum() {
		return learningNum;
	}

	public void setLearningNum(Integer learningNum) {
		this.learningNum = learningNum;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getLevelDesc() {
		return levelDesc;
	}

	public void setLevelDesc(String levelDesc) {
		this.levelDesc = levelDesc;
	}

	public List<Chapter> getChapterList() {
		return chapterList;
	}

	public void setChapterList(List<Chapter> chapterList) {
		this.chapterList = chapterList;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getDescr() {
		return Descr;
	}

	public void setDescr(String descr) {
		Descr = descr;
	}
	
}
