package com.tn.ciqual.services.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import com.tn.ciqual.model.Food;
import com.tn.ciqual.services.interfaces.FoodSvcRemote;

/**
 * Session Bean implementation class FoodSvc
 */
@Stateless
@LocalBean
public class FoodSvc implements FoodSvcRemote {
	private static EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public FoodSvc() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addFood(Food food) {
		boolean b = false;
		try {
			entityManager.persist(food);
			b = true;
		} catch (Exception e) {
			System.out.println("Error adding food");
			e.printStackTrace();
		}
		return b;
	}

}
