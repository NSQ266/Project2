package com.javaweb1.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb1.Model.BuildingDTO;
import com.javaweb1.Model.ErrorResponseDTO;
import com.javaweb1.service.BuildingService;

import customexception.FieldRequiredException;

@RestController 
public class BuildingAPI {
	@Autowired
	private BuildingService buildingService;
	
	@GetMapping(value = "/api/building/")
	public List<BuildingDTO> getbuilding(@RequestParam(name = "name", required = false) String name,
										@RequestParam(name = "districtId", required = false) Long district,
										@RequestParam(name = "typecode", required = false) List<String> ode) {
		List<BuildingDTO> result = buildingService.findAll(name, district);
		return result;
	}
	
//	public void valiDate(BuildingDTO buildingDTO ) {
//		if(buildingDTO.getName() == null || buildingDTO.getName().equals("") || buildingDTO.getNumberOfBasement() == null) {
//			throw new FieldRequiredException("name or numberOfBasement is null");
//		}
//	}
	
	
	@DeleteMapping(value = "/api/building/{id}/{name}/")
	public void deleteBuilding(@PathVariable Integer id,
							   @PathVariable String name,
							   @RequestParam(value = "ward", required = false) String ward) {
		 System.out.println("Da xoa toa nha có id la" + id + " roi nhe!");
	}
}
