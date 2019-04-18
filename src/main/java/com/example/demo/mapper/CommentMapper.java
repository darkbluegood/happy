package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Comment;

@Mapper
public interface CommentMapper {
	public int insert(Comment Comment);
}
