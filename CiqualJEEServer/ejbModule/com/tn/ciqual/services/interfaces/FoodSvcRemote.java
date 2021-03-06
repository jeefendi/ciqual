package com.tn.ciqual.services.interfaces;

import javax.ejb.Remote;

import com.tn.ciqual.model.Food;

@Remote
public interface FoodSvcRemote {

	boolean addFood(Food food);

	boolean removeFoodById(int id);

	Food findFoodById(int id);

	boolean updateFood(Food food);

}
