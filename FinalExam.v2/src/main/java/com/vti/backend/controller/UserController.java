/**
 * 
 */
package com.vti.backend.controller;

import java.util.List;

import com.vti.backend.service.IUserService;
import com.vti.backend.service.UserService;
import com.vti.entity.User;

public class UserController {

	private IUserService service;

	public UserController() {
		service = new UserService();

	}

	public List<User> getListUser() {
		// TODO Auto-generated method stub
		return service.getListUser();
	}

	public void login(String email, String password) {
		// TODO Auto-generated method stub
		service.login(email, password);

	}

	public List<User> getListManagerOfProject() {
		// TODO Auto-generated method stub
		return service.getListManagerOfProject();
	}

	public boolean isProjectExists(int id) {
		// TODO Auto-generated method stub
		return service.isProjectExists(id);
	}

	public List<User> getEmployeeManagerByIDProject(int id) {
		// TODO Auto-generated method stub
		return service.getEmployeeManagerByIDProject(id);
	}
	public  boolean checkLogin(String email, String password) {
		return service.checkLogin(email,password);
	}
}
