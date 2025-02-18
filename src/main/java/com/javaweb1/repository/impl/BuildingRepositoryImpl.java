package com.javaweb1.repository.impl;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.javaweb1.builer.BuildingSearchBuilder;
import com.javaweb1.repository.BuildingRepository;
import com.javaweb1.repository.entity.BuildingEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
@Primary
public class BuildingRepositoryImpl implements BuildingRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public List<BuildingEntity> findAll(BuildingSearchBuilder buildingSearchBuilder) {
		//JPQL: JPA Query Language
//		String sql = "FROM BuildingEntity b WHERE b.districtid = 1";
//		Query query = entityManager.createQuery(sql, BuildingEntity.class);
		
		//Sql native
		String sql = "SELECT * FROM building b WHERE b.name like '%building' ";
		Query query = entityManager.createNativeQuery(sql, BuildingEntity.class);
		return query.getResultList();
	}

}
