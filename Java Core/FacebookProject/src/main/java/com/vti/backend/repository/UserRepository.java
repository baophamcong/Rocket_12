package com.vti.backend.repository;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

import com.vti.entity.Message;
import com.vti.entity.Relationship;
import com.vti.entity.User;
import com.vti.utils.JdbcUtils;

public class UserRepository implements IUserRepository {

	private JdbcUtils jdbcUtils;
	private Connection connection;
/**
 * 
	 * Constructor for class AccountService.
	 * 
	 * @Description: .
	 * @author: BaoPC
	 * @create_date: May 9, 2021
	 * @version: 1.0
	 * @modifer: BaoPC
	 * @modifer_date: May 9, 2021
	 * @throws IOException
 */
	public UserRepository() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {

		this.jdbcUtils = new JdbcUtils();
		this.connection = jdbcUtils.Connect();
	}

	/*
	 * Read all user from database and then add them into a list 1:Accepted, 0:
	 * Pending, 2:Declined, 3:Blocked
	 */
	public List<User> getListFriend() throws SQLException {
		List<User> users = new ArrayList<User>();

		String sql = "  SELECT * FROM  `users` `u`\r\n" + "  WHERE `u`.`user_id` IN\r\n"
				+ "  (SELECT `r`.`user_two_id` FROM `relationship` `r`\r\n"
				+ "  WHERE `r`.`user_one_id` = 1  AND  `r`.`status` = 1);";

		Statement statement = connection.createStatement();
		;
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			int id = resultSet.getInt(1);
			String username = resultSet.getString(2);
			String email = resultSet.getString(3);
			String password = resultSet.getString(4);
			User user = new User(id, username, email, password);
			users.add(user);
		}

		return users;
	}

	/*
	 * Inserting a new Friend request. Friend request sent by user 1 to user 2
	 * 1:Accepted, 0: Pending, 2:Declined, 3:Blocked
	 */
	public void createUser() throws SQLException {

		String sql = "INSERT INTO `relationship` (`user_one_id`, `user_two_id`, `status`, `action_user_id`)"
				+ " VALUES (?, ?, ?, ?) ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, 1);
		preparedStatement.setInt(2, 2);
		preparedStatement.setInt(3, 0);
		preparedStatement.setInt(4, 1);
		int check = preparedStatement.executeUpdate();
		if (check > 0) {

			System.out.println("ket ban thanh cong");
		} else {
			System.out.println("ket ban that bai");
		}
	}

	/*
	 * Updating the status of the friend request. Accepting friend request sent to
	 * user 2 by user 1. 1:Accepted, 0: Pending, 2:Declined, 3:Blocked
	 */
	public void updateUser() throws SQLException {

		String sql = "UPDATE `relationship` SET `status` = ?, `action_user_id` = ?"
				+ " WHERE `user_one_id` = ? AND `user_two_id` = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, 1);
		preparedStatement.setInt(2, 3);
		preparedStatement.setInt(3, 1);
		preparedStatement.setInt(4, 3);
		int check = preparedStatement.executeUpdate();
		if (check > 0) {
			System.out.println("dong y ket ban");
		} else {
			System.out.println("khong dong y ket ban");
		}
	}

	/*
	 * Read all Relationship from database and then add them into a list
	 */
	public List<Relationship> getListAllFriend() throws SQLException {

		List<Relationship> relationships = new ArrayList<Relationship>();
		String sql = "SELECT * FROM `relationship`";

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			int id1 = resultSet.getInt(1);
			int id2 = resultSet.getInt(2);
			int status = resultSet.getInt(3);

			int action = resultSet.getInt(4);
			Relationship relationship = new Relationship(id1, id2, status, action);
			relationships.add(relationship);
		}

		return relationships;
	}

	/*
	 * displays a list of 10 friends that are currently texting users
	 */
	public List<User> getList10Friend() throws SQLException {

		List<User> users = new ArrayList<User>();
		String sql = " SELECT `u`.`user_id`,`u`.`username`, `u`.`email`, `u`.`password`\r\n" + "  FROM  `users` `u`\r\n"
				+ " JOIN `message` `m` ON `u`.`user_id` = `m`.`message_id`\r\n" + "  ORDER BY `m`.`sendingtime` \r\n"
				+ "  LIMIT 10;\r\n" + "";

		Statement statement = connection.createStatement();
		;
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			int id = resultSet.getInt(1);
			String username = resultSet.getString(2);
			String email = resultSet.getString(3);
			String password = resultSet.getString(4);
			User user = new User(id, username, email, password);
			users.add(user);
		}

		return users;
	}

	/*
	 * displays a friend's message from the current user
	 */
	public List<Message> getMessage() throws SQLException {

		List<Message> messages = new ArrayList<Message>();

		String sql = " SELECT * \r\n" + "FROM `message`\r\n" + "WHERE `senderid` = 1 OR `receiverid` =1";

		Statement statement = connection.createStatement();
		;
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			int id = resultSet.getInt(1);
			Date sendingtime = resultSet.getDate(2);
			int senderid = resultSet.getInt(3);
			int receiverid = resultSet.getInt(4);
			String content = resultSet.getString(5);
			Message message = new Message(id, sendingtime, senderid, receiverid, content);
			messages.add(message);
		}

		return messages;
	}

}
