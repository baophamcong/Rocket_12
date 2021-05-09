package com.vti.backend.service;

import java.util.List;

import com.vti.entity.Position;

public interface IPositionService {

	List<Position> showPositionList();

	void updatePositionNameById(int id, String name);

	void saveAll();

	void deletePositionNameById(int id1);

}
