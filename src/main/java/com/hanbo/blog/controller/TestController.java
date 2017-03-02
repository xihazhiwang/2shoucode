package com.hanbo.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "test")
public class TestController {

	@RequestMapping(value = "")
	public String test(){
		System.out.println("hello world");
		return "index";
	}
	
}
