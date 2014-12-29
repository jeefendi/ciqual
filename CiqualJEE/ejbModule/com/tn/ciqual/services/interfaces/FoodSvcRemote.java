package com.tn.ciqual.services.interfaces;

import javax.ejb.Remote;

import com.tn.ciqual.model.Food;

@Remote
public interface FoodSvcRemote {
	boolean addFood(Food food);

}
