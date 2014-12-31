package com.tn.ciqual.services.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.tn.ciqual.model.Food;
import com.tn.ciqual.services.interfaces.FoodSvcRemote;

/**
 * Session Bean implementation class FoodSvc
 */
@Stateless
@LocalBean
public class FoodSvc implements FoodSvcRemote {
	@PersistenceContext
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

	@Override
	public boolean removeFoodById(int id) {
		boolean b = false;
		try {
			entityManager.remove(findFoodById(id));
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Food findFoodById(int id) {
		Food foodFound = null;
		try {
			foodFound = entityManager.find(Food.class, id);
		} catch (Exception e) {
			System.out.println("Food not found !");
		}
		return foodFound;
	}

	@Override
	public boolean updateFood(Food food) {
		boolean b = false;
		try {
			entityManager.merge(food);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
