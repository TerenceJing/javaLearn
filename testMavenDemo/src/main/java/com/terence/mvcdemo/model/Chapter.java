package com.terence.mvcdemo.model;

public class Chapter {
	private Integer Id; //章节Id
	private Integer courseId; //所属课程ID
	private Integer Order;    //顺序
	private String Title;     //章节名称
	private String Descr;     //章节描述
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public Integer getOrder() {
		return Order;
	}
	public void setOrder(Integer order) {
		Order = order;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescr() {
		return Descr;
	}
	public void setDescr(String descr) {
		Descr = descr;
	}
	
}
