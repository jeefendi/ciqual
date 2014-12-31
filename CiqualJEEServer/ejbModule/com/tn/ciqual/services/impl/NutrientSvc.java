package com.tn.ciqual.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.tn.ciqual.model.Nutrient;
import com.tn.ciqual.services.interfaces.NutrientSvcRemote;

/**
 * Session Bean implementation class NutrientSvc
 */
@Stateless
public class NutrientSvc implements NutrientSvcRemote {
	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public NutrientSvc() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addNutrient(Nutrient nutrient) {
		boolean b = false;
		try {
			entityManager.persist(nutrient);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public boolean removeNutrient(Nutrient nutrient) {
		
		return false;
	}

	@Override
	public boolean updateNutrient(Nutrient nutrient) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Nutrient findNutrientById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
