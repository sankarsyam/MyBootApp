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
		System.out.println("Hai Syam");
	}

	@Override
	public void byUser(String userName) throws Exception {
		System.out.println("Bye Syam");
	}

	@Override
	public void add(String userName) throws Exception {
		System.out.println("User updated");
	}

	@Override
	public void sub(String userName) throws Exception {
		System.out.println("User moved");
	}
	/**
	 * my method
	 **/
	@Override
	public void mthodBySreerag(String userName) throws Exception {
		System.out.println("Sreera's method");
	}

	@Override
	public String getUsername() throws Exception {
		return "Syam";
	}

	@Override
	public void create(String userName) throws Exception {
		System.out.println("Created successfully");
	}

	@Override
	public void methodAddedInDevBranch(String userName) throws Exception {
		System.out.println("This method is from dev branch");
	}

	public void methodAddedInTestBranch() throws Exception {
		System.out.println("This method is created from test branch");
	}

}
