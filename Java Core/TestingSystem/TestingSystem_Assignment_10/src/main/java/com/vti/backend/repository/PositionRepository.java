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

import com.vti.entity.Position;
import com.vti.utils.JdbcUtils;

public class PositionRepository implements IPositionRepository {
	private JdbcUtils jdbcUtils;
	private Connection connection;

	public PositionRepository() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {

		this.jdbcUtils = new JdbcUtils();
		this.connection = jdbcUtils.Connect();
	}

	public List<Position> getPositionList() throws SQLException {

		List<Position> positions = new ArrayList<Position>();

		String sql = "SELECT * FROM  `Position`";
		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			int number = resultSet.getInt(1);
			String name = resultSet.getString(2);
			Position p = new Position(number, name);
			positions.add(p);
		}
		return positions;
	}

	public void updatePositionNameById(int id, String name) throws SQLException {

		String sql = "UPDATE `position`SET  PositionName = ?  WHERE PositionID =?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, name);
		preparedStatement.setInt(2, id);

		int count = preparedStatement.executeUpdate();

		if (count > 0) {
			System.out.println("update thanh cong");

		} else {
			System.out.println(" update khong thanh cong ");
		}
	}

	public boolean saveAll() throws Exception {
		// Open connection
		String sql = "INSERT INTO `position`(PositionName,PositionID) VALUES (?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setString(1, "ABC");
		preparedStatement.setInt(2, 7);
		int count = preparedStatement.executeUpdate();
		if (count > 0) {
			System.out.println("insert thanh cong");

		} else {
			System.out.println(" insert khong thanh cong ");
		}
		return false;
	}

	public void deletePositionNameById(int id1) throws SQLException {
		String sql = " DELETE FROM `position` WHERE PositionID =?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
//		preparedStatement.setString(1, name);
		preparedStatement.setInt(1, id1);
		int count = preparedStatement.executeUpdate();
		if (count > 0) {
			System.out.println("delete thanh cong");

		} else {
			System.out.println(" delete khong thanh cong ");
		}

	}

}
