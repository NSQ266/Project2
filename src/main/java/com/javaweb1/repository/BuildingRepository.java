package com.javaweb1.repository;

import java.util.List;

import com.javaweb1.builer.BuildingSearchBuilder;
import com.javaweb1.repository.entity.BuildingEntity;

public interface BuildingRepository {
	List<BuildingEntity> findAll(BuildingSearchBuilder buildingSearchBuilder);
}
