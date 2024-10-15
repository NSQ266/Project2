package com.javaweb1.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb1.Model.BuildingDTO;
import com.javaweb1.converter.BuildingDTOConverter;
import com.javaweb1.repository.BuildingRepository;
import com.javaweb1.repository.DistrictRepository;
import com.javaweb1.repository.RentAreaRepository;
import com.javaweb1.repository.entity.BuildingEntity;
import com.javaweb1.repository.entity.DistrictEntity;
import com.javaweb1.repository.entity.RentAreaEntity;
import com.javaweb1.service.BuildingService;

@Service
public class BuildingServiceImpl implements BuildingService{
	@Autowired
	private BuildingRepository buildingRepository;
	
	@Autowired
	private BuildingDTOConverter buildingDTOConverter;
	
	@Override
	public List<BuildingDTO> findAll(Map<String, Object> params, List<String> typeCode) {
		List<BuildingEntity> buildingEntities = buildingRepository.findAll(params, typeCode);
		List<BuildingDTO> result = new ArrayList<BuildingDTO>();
		for(BuildingEntity item : buildingEntities) {
			BuildingDTO building = buildingDTOConverter.toBuildingDTO(item);
			result.add(building);
		}
		return result;
	}
}
