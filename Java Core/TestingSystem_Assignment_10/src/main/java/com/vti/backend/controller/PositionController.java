package com.vti.backend.controller;

import java.util.List;

import com.vti.backend.service.IPositionService;
import com.vti.backend.service.PositionService;
import com.vti.entity.Position;

public class PositionController {

	private IPositionService positionService;

	public PositionController() {

		positionService = new PositionService();

	}

	public List<Position> showPositionList() {

		return positionService.showPositionList();
	}

	public void updatePositionNameById(int id, String name) {
		positionService.updatePositionNameById(id, name);

	}

	public void saveAll() {
		positionService.saveAll();
	}

	public void deletePositionNameById(int id1) {
		positionService.deletePositionNameById(id1);
	}

}
