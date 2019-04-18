package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Title;

@Mapper
public interface TitleMapper {
	public int insert(Title title);
	public List<Title> titleList();
	public int titleUpdateById(Title title);
}

