package com.vti.backend.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.repository.AccountRepository;
import com.vti.backend.repository.IAccountRepository;
import com.vti.entity.Account;

public class AccountService implements IAccountService {

	private IAccountRepository acRepository;

	public AccountService() {
		try {
			acRepository = new AccountRepository();
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

	public List<Account> getListAccount() {

		try {
			return acRepository.getListAccount();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Account getAccountByID(int parseInt) {
		// TODO Auto-generated method stub
		try {
			return acRepository.getAccountByID(parseInt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void createAccount(String email, String username, String fullName) {
		try {
			acRepository.createAccount(email, username, fullName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateAccountByID(int id, String newFullName) throws Exception {
		try {
			acRepository.updateAccountByID(id, newFullName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteAccount(int id) throws Exception {
		try {
			acRepository.deleteAccount(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}