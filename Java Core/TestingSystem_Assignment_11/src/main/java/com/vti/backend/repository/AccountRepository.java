package com.vti.backend.repository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Account;
import com.vti.utils.JdbcUtils;

public class AccountRepository implements IAccountRepository {

	private JdbcUtils jdbcUtils;
	private Connection connection;

	public AccountRepository() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		this.jdbcUtils = new JdbcUtils();
		this.connection = jdbcUtils.Connect();
	}

	public List<Account> getListAccount() throws SQLException {

		List<Account> accounts = new ArrayList<Account>();

		String sql = "SELECT * FROM  `Account`";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			int id = resultSet.getInt(1);
			String email = resultSet.getString(2);
			String username = resultSet.getString(3);
			String fullname = resultSet.getString(4);
			Account account = new Account(id, email, username, fullname);
			accounts.add(account);
		}
		return accounts;
	}

	public Account getAccountByID(int parseInt) throws SQLException {

		String sql = "SELECT * FROM `Account` WHERE AccountId = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setInt(1, parseInt);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			Account account = new Account(resultSet.getInt("AccountId"), resultSet.getString("Email"),
					resultSet.getString("Username"), resultSet.getString("FullName"));

			// disconnect

			return account;

		}
		return null;
	}

	public void createAccount(String email, String username, String fullName) throws SQLException {

		String sql = "INSERT INTO Account (Email, Username, Fullname)" + "VALUE              (   ? ,   ?   	,   ?	)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setString(1, email);
		preparedStatement.setString(2, username);
		preparedStatement.setString(3, fullName);

		int check = preparedStatement.executeUpdate();
		if (check > 0) {
			System.out.println("insert thanh cong");
		} else {
			System.out.println("insert that bai");
		}
	}

	public void updateAccountByID(int id, String newFullName) throws Exception {

		// Create a statement object
		String sql = "UPDATE Account SET FullName = ? WHERE AccountId = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setString(1, newFullName);
		preparedStatement.setInt(2, id);

		// Step 4: execute query
		int check = preparedStatement.executeUpdate();

		// Check check success or false
		if (check > 0) {
			System.out.println("update thanh cong");
		} else {
			System.out.println("update that bai");
		}
	}

	public void deleteAccount(int id) throws Exception {

		// Create a statement object
		String sql = "DELETE FROM Account WHERE AccountId = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setInt(1, id);

		// Step 4: execute query
		int check = preparedStatement.executeUpdate();

		// Check check success or false
		if (check > 0) {
			System.out.println("deleteAccount thanh cong");
		} else {
			System.out.println("deleteAccount that bai");
		}
	}

}
