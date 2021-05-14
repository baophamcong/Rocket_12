package com.vti.utils;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
	static Properties properties;
	static Connection connection;

	// Tạo method để test xem đã kết nối thành công tới sql chưa?
	public static Connection Connect() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		if (connection != null) {
			return connection;
		}

		properties = new Properties();
		properties.load(new FileInputStream("H:\\Java Core\\eclipse-workspace\\FinalExam\\resourses\\database.properties"));
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String driver = properties.getProperty("driver");

		Class.forName(driver);
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect success! ");

		return connection;
	}

	// Tạo method để get Connect tới database.
	public void isConnectedForTesting()
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		properties = new Properties();
		properties.load(new FileInputStream(
				"H:\\Java Core\\eclipse-workspace\\FinalExam\\resourses\\database.properties"));
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		// Step 1: register the driver class with DriverManager
		Class.forName(properties.getProperty("driver"));
		// Step 2: get a Database Connection
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect success! ");
	}

	// Tạo method để get disconnect tới database
	public void disconnect() throws SQLException {
		connection.close();

	}
}
