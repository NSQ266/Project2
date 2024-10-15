package com.javaweb1.repository;

import com.javaweb1.repository.entity.DistrictEntity;

public interface DistrictRepository {
	DistrictEntity findNameById(Long id);
}
