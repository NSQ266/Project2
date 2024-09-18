package com.javaweb1.service;

import java.util.List;

import com.javaweb1.Model.BuildingDTO;

public interface BuildingService {
	List<BuildingDTO> findAll(String name, Long districtId);
}
