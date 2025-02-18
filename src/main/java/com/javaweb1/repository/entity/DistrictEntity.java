package com.javaweb1.repository.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "district")
public class DistrictEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "code")
	private String code; 
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy = "district",fetch = FetchType.LAZY)
	private List<BuildingEntity> buildingEntities = new ArrayList<>();
	
	
	public List<BuildingEntity> getBuildingEntities() {
		return buildingEntities;
	}
	public void setBuildingEntities(List<BuildingEntity> buildingEntities) {
		this.buildingEntities = buildingEntities;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
