package com.vti.backend.service;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.repository.IUserRepository;
import com.vti.backend.repository.UserRepository;
import com.vti.entity.Message;
import com.vti.entity.Relationship;
import com.vti.entity.User;

/**
 * 
 * This class is service of User
 * 
 * @Description: .
 * @author: BaoPC
 * @create_date: May 9, 2021
 * @version: 1.0
 * @modifer: BaoPC
 * @modifer_date: May 9, 2021
 */
public class UserService implements IUserService {

	private IUserRepository userRepository;

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
	public UserService() {

		try {
			userRepository = new UserRepository();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<User> getListFriend() {
		// TODO Auto-generated method stub
		try {
			return userRepository.getListFriend();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void createUser() {
		// TODO Auto-generated method stub
		try {
			userRepository.createUser();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateUser() {

		try {
			userRepository.updateUser();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Relationship> getListAllFriend() {
		// TODO Auto-generated method stub
		try {
			return userRepository.getListAllFriend();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<User> getList10Friend() {

		try {
			return userRepository.getList10Friend();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<Message> getMessage() {
		// TODO Auto-generated method stub
		try {
			return userRepository.getMessage();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
