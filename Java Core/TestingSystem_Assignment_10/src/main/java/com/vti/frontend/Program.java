package com.vti.frontend;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.controller.PositionController;
import com.vti.entity.Position;
import com.vti.utils.JdbcUtils;

public class Program {

	private static PositionController positionController;

	public static void main(String[] args)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		JdbcUtils jdbcUtils = new JdbcUtils();
//		jdbcUtils.isConnectedForTesting();
//		jdbcUtils.Connect();
//		jdbcUtils.disconnect();

		positionController = new PositionController();

//
//		int id = 4;
//		String name = "DEV";
//		updatePositionNameById(id,name);

//	    saveAll();

		int id1 = 2;
		deletePositionNameById(id1);
		showPositionList();
	}

	private static void deletePositionNameById(int id1) {
		positionController.deletePositionNameById(id1);

	}

	private static void saveAll() {

		positionController.saveAll();

	}

	private static void updatePositionNameById(int id, String name) {

		positionController.updatePositionNameById(id, name);
	}

	private static void showPositionList() {

		List<Position> positions = positionController.showPositionList();

		for (Position position : positions) {
			System.out.println(position.toString());
		}
	}

}
