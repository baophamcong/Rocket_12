package com.vti.backend.repository;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Position;

public interface IPositionRepository {

	List<Position> getPositionList() throws SQLException;

	void updatePositionNameById(int id, String name) throws SQLException;
	
	public boolean saveAll() throws Exception;
	
	void deletePositionNameById(int id1) throws SQLException;

}
