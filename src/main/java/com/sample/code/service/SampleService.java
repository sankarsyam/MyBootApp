package com.sample.code.service;

public interface SampleService {

	public void saveUser(String userName)throws Exception;
	
	public void deleteUser(String userName)throws Exception;
	
	public void updateUser(String userName)throws Exception;
	
	public String getUsername()throws Exception;
	
	public void create(String userName)throws Exception;
}
