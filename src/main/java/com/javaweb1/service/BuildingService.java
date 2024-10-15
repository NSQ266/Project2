package com.javaweb1.service;

import java.util.List;
import java.util.Map;

import com.javaweb1.Model.BuildingDTO;

public interface BuildingService {
	List<BuildingDTO> findAll(Map<String, Object> params, List<String> typeCode);

}
