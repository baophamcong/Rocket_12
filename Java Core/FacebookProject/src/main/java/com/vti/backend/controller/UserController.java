package com.vti.backend.controller;

import java.util.List;

import com.vti.backend.service.IUserService;
import com.vti.backend.service.UserService;
import com.vti.entity.Message;
import com.vti.entity.Relationship;
import com.vti.entity.User;

public class UserController {

	private IUserService userService;
/**
 * 
	 * Constructor for class UserService.
	 * 
	 * @Description: .
	 * @author: BaoPC
	 * @create_date: May 9, 2021
	 * @version: 1.0
	 * @modifer: BaoPC
	 * @modifer_date: May 9, 2021
	 * @throws IOException
 */
	public UserController() {
		userService = new UserService();

	}

	public List<User> getListFriend() {

		return userService.getListFriend();
	}

	public void createUser() {

		userService.createUser();
	}

	public void updateUser() {

		userService.updateUser();
	}

	public List<Relationship> getListAllFriend() {
		// TODO Auto-generated method stub
		return userService.getListAllFriend();
	}

	public List<User> getList10Friend() {
		// TODO Auto-generated method stub
		return userService.getList10Friend();
	}

	public List<Message> getMessage() {
		// TODO Auto-generated method stub
		return userService.getMessage();
	}

}
