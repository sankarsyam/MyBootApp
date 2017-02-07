package com.sample.code.service;

import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService{

	@Override
	public void saveUser(String userName) throws Exception {
		
		System.out.println("Saved successfully");
		
	}

	@Override
	public void deleteUser(String userName) throws Exception {
		System.out.println("deleted successfully");
		
	}
	
	@Override
	public void updateUser(String userName) throws Exception {

		//my sample comment
		//sample comment
		System.out.println("updated successfully");
	}

	@Override
	public void haiUser(String userName) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void byUser(String userName) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(String userName) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub(String userName) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
