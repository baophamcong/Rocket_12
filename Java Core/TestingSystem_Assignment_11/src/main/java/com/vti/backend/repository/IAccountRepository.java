package com.vti.backend.repository;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Account;

public interface IAccountRepository {

	List<Account> getListAccount() throws SQLException;

	Account getAccountByID(int parseInt) throws SQLException;

	void createAccount(String email, String username, String fullName) throws SQLException;
	 void updateAccountByID(int id, String newFullName) throws Exception;
	 void deleteAccount(int id) throws Exception;
}
