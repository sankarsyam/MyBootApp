package com.sample.code.service;

import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService{

	@Override
	public void saveUser(String userName) throws Exception {
		
		System.out.println("Saved successfully");
		
		
	}

}
