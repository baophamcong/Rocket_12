package com.vti.backend.repository;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.User;

public interface IUserRepository {

	List<User> getListUser() throws SQLException;

	User login(String email, String password) throws Exception;

	List<User> getListManagerOfProject() throws SQLException;

	List<User> getEmployeeManagerByIDProject(int id) throws SQLException;

	boolean isProjectExists(int id) throws SQLException;

	boolean checkLogin(String email, String password) throws SQLException;
}
