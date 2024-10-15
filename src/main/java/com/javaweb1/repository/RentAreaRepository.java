package com.javaweb1.repository;

import java.util.List;

import com.javaweb1.repository.entity.RentAreaEntity;

public interface RentAreaRepository {
	List<RentAreaEntity> getValueByBuildingId(Long id);
}
