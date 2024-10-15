package com.javaweb1.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javaweb1.Model.BuildingDTO;
import com.javaweb1.repository.DistrictRepository;
import com.javaweb1.repository.RentAreaRepository;
import com.javaweb1.repository.entity.BuildingEntity;
import com.javaweb1.repository.entity.DistrictEntity;
import com.javaweb1.repository.entity.RentAreaEntity;

@Component
public class BuildingDTOConverter {
	@Autowired
	private DistrictRepository districtRepository;
	
	@Autowired
	private RentAreaRepository rentAreaRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public BuildingDTO toBuildingDTO(BuildingEntity item) {
		BuildingDTO building = modelMapper.map(item, BuildingDTO.class);
		DistrictEntity districtEntity = districtRepository.findNameById(item.getDistrictid());
		building.setAddress(item.getStreet() + ", " + item.getWard() + "," + districtEntity.getName());
		List<RentAreaEntity> rentAreas = rentAreaRepository.getValueByBuildingId(item.getId());
		String areaResult = rentAreas.stream().map(it -> it.getValue().toString()).collect(Collectors.joining(","));
		building.setRentArea(areaResult);
		return building;
	}
}
