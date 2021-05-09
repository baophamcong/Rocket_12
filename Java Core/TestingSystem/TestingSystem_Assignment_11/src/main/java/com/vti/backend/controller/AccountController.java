package com.vti.backend.controller;

import java.util.List;

import com.vti.backend.service.AccountService;
import com.vti.backend.service.IAccountService;
import com.vti.entity.Account;

public class AccountController {

	private IAccountService acservice;
	public AccountController() {
		acservice = new AccountService();
	}
	
	public List<Account> getListAccount() {
		return acservice.getListAccount();
	}

	public Account getAccountByID(int parseInt) {

		return acservice.getAccountByID(parseInt);
	}

	public void createAccount(String email, String username, String fullName) {

		 acservice.createAccount( email,username, fullName);
	}

	public void deleteAccount(int id) throws Exception {

		acservice.deleteAccount(id);
	}

	public void updateAccountByID(int id, String fullName) throws Exception {

		acservice.updateAccountByID(id,fullName);
	}

}
