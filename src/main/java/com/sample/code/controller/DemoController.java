package com.sample.code.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/demo")
public class DemoController {

	@RequestMapping(value="/home")
	public String getMyPage(){
		return "Welcome Gust!";
		
	}
}
