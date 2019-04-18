package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.TestService;
import com.example.demo.service.UserService;

import junit.framework.Test;


@RestController
@RequestMapping(value = "/CRUD", method = { RequestMethod.GET, RequestMethod.POST })
public class CRUD {
	@Resource(name="sdsd")
	private TestService testService;
	@RequestMapping("/test")
	public String iTest(){
		testService.setName("raowensheng");
		return "haha";
	}
	@RequestMapping("/ListUser")
	@ResponseBody
	public List<User> ListUser(){
		return userservice.ListUser();
	}

	@RequestMapping("/ListUserByname")
	@ResponseBody
	public List<User> ListUserByname(String name){
		return userservice.findByName(name);
	}
	@Autowired
	private UserService userservice;

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(int id) {
		int result = userservice.delete(id);
		if (result >= 1) {
			return "删除成功";
		} else {
			return "删除失败";
		}
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(User user) {
		int result = userservice.Update(user);
		if (result >= 1) {
			return "修改成功";
		} else {
			return "修改失败";
		}

	}
	//@CrossOrigin(origins = {"http://127.0.0.1:8081", "null"})
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public User insert(@RequestBody User user) {
		System.out.println("88883");
		return userservice.insertUser(user);
		}
	

}
