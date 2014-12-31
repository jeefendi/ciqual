package com.tn.ciqual.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tn.ciqual.model.FoodGroup;
import com.tn.ciqual.services.interfaces.FoodGroupSvcRemote;

/**
 * Session Bean implementation class FoodGroupSvc
 */
@Stateless
public class FoodGroupSvc implements FoodGroupSvcRemote {
	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public FoodGroupSvc() {
	}

	@Override
	public boolean addFoodGroup(FoodGroup foodGroup) {
		boolean b = false;
		try {
			entityManager.persist(foodGroup);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return b;
	}

	@Override
	public FoodGroup findFoodGroupById(Integer id) {
		FoodGroup foodGroupFound = entityManager.find(FoodGroup.class, id);
		return foodGroupFound;
	}

	@Override
	public boolean removeFoodGroupById(Integer id) {
		boolean b = false;
		try {
			entityManager.remove(entityManager.find(FoodGroup.class, id));
		} catch (Exception e) {
			// TODO: handle exception
		}
		return b;
	}

	@Override
	public boolean updateFoodGroup(FoodGroup foodGroup) {
		boolean b = false;
		try {
			entityManager.merge(foodGroup);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return b;
	}

	@Override
	public List<FoodGroup> findAllFoodGroups() {
		List<FoodGroup> foodGroups = null;
		String jpqlQuery = "select fg from FoodGroup fg";
		TypedQuery<FoodGroup> typedQuery = entityManager.createNamedQuery(
				jpqlQuery, FoodGroup.class);
		typedQuery.getResultList();
		return foodGroups;
	}
}
