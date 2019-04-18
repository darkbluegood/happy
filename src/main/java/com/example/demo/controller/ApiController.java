package com.example.demo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Comment;
import com.example.demo.entity.Title;
import com.example.demo.service.CommentService;
import com.example.demo.service.TitleService;

@RestController
@RequestMapping(value="/api", method = {RequestMethod.GET, RequestMethod.POST})
public class ApiController {
	@Autowired
	private TitleService titleService;
	@RequestMapping( value ="/insert", method=RequestMethod.POST)
	public Title insert(@RequestBody Title title){
		System.out.println("222");
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		title.setTitleId(uuid);
		return titleService.insert(title);
	}
	@RequestMapping(value="/page",method = RequestMethod.GET)
	public List<Title> titleList(){
		return titleService.titleList();
	}
	@RequestMapping(value="/update",method = RequestMethod.POST)
	public Title titleUpdate(@RequestBody Title title){
		System.out.println(title.getTitle());
		return titleService.update(title);
	}
	@Autowired
	private CommentService commentService;
	@RequestMapping(value="/comment/insert",method=RequestMethod.POST)
	public Comment commentInsert(@RequestBody Comment comment){
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		System.out.println(comment.getName());
		comment.setCommentId(uuid);
		return commentService.insert(comment);
	}
}
