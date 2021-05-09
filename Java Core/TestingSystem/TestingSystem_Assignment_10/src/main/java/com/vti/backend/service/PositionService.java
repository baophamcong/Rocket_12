package com.vti.backend.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.repository.IPositionRepository;
import com.vti.backend.repository.PositionRepository;
import com.vti.entity.Position;

public class PositionService implements IPositionService {

	private IPositionRepository positionRepository ;
	public PositionService() {
		try {
			positionRepository = new PositionRepository();
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
	public List<Position> showPositionList() {

		try {
			return positionRepository.getPositionList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public void updatePositionNameById(int id, String name) {
		try {
			positionRepository.updatePositionNameById(id,  name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void saveAll() {
		try {
			positionRepository.saveAll()	;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void deletePositionNameById(int id1) {
		try {
			positionRepository.deletePositionNameById(id1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
