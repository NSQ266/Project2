package com.javaweb1.repository;

import java.util.List;
import java.util.Map;

import com.javaweb1.repository.entity.BuildingEntity;

public interface BuildingRepository {
	List<BuildingEntity> findAll(Map<String, Object> params, List<String> typeCode);
}
