package com.sample.code.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class SampleController {
	/**
	 * Hi
	 * @return
	 */
	@RequestMapping(value="/mypage")
	public String getMyPage(){
		return "Welcome Gust!";
		
	}
}
