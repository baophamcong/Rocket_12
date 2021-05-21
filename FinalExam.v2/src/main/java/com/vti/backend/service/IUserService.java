package com.vti.backend.service;

import java.util.List;

import com.vti.entity.User;

public interface IUserService {

	List<User> getListUser();

	void login(String email, String password);

	List<User> getListManagerOfProject();

	List<User> getEmployeeManagerByIDProject(int id);

	boolean isProjectExists(int id);

	boolean checkLogin(String email, String password);

}
