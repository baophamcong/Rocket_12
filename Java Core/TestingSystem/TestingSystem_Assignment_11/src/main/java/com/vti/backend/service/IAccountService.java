package com.vti.backend.service;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Account;

public interface IAccountService {

	List<Account> getListAccount();

	Account getAccountByID(int parseInt);

	void createAccount(String email, String username, String fullName);

	void updateAccountByID(int id, String newFullName) throws Exception ;

	void deleteAccount(int id) throws Exception;
}
