package com.javaweb1.repository;

import java.util.List;

import com.javaweb1.repository.entity.BuildingEntity;

public interface BuildingRepository {
	List<BuildingEntity> findAll(String name, Long districtId);
}
