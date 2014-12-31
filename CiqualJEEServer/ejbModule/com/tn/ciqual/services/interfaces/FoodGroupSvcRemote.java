package com.tn.ciqual.services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import com.tn.ciqual.model.FoodGroup;

@Remote
public interface FoodGroupSvcRemote {
	boolean addFoodGroup(FoodGroup foodGroup);

	FoodGroup findFoodGroupById(Integer id);

	boolean removeFoodGroupById(Integer id);

	boolean updateFoodGroup(FoodGroup foodGroup);

	List<FoodGroup> findAllFoodGroups();

}
