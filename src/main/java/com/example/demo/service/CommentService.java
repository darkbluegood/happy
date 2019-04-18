package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Comment;
import com.example.demo.mapper.CommentMapper;

@Service
public class CommentService {
	@Autowired
	private CommentMapper commentMapper;
	public Comment insert(Comment comment){
		commentMapper.insert(comment);
		return comment;
	}
}
