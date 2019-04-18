package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Title;
import com.example.demo.mapper.TitleMapper;

@Service
public class TitleService {
	@Autowired
	private TitleMapper titleMapper;
	public Title insert(Title title){
		System.out.println("33344");
		titleMapper.insert(title);
		return title;
	}
	public List<Title> titleList(){
		return titleMapper.titleList();
	}
	public Title update(Title title){
		 titleMapper.titleUpdateById(title);
		 return title;
	}
}
