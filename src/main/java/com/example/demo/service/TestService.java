package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service("sdsd")
public class TestService {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println(name);
		this.name = name;
	}
}
