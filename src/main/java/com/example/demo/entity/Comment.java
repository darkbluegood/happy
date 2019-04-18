package com.example.demo.entity;

import java.util.Date;

public class Comment {
	private String commentId;
	private String name;
	private Date commentDt;
	private String content;
	private String imagePath;
	private String ssId;
	
	
	
	public String getSsId() {
		return ssId;
	}
	public void setSsId(String ssId) {
		this.ssId = ssId;
	}
	public String getCommentId() {
		return commentId;
	}
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCommentDt() {
		return commentDt;
	}
	public void setCommentDt(Date commentDt) {
		this.commentDt = commentDt;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	
}
