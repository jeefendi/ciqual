package com.tn.ciqual.client.test;

import java.util.ArrayList;
import java.util.List;

import com.tn.ciqual.model.Food;
import com.tn.ciqual.model.FoodGroup;
import com.tn.ciqual.services.interfaces.FoodGroupSvcRemote;

public class TestFoodGroupSvc {
	private static FoodGroupSvcRemote foodGroupSvcRemote = (FoodGroupSvcRemote) Proxy
			.getProxy("ejb:/CiqualJEEServer/FoodGroupSvc!"
					+ FoodGroupSvcRemote.class.getCanonicalName());

	public static void main(String[] args) {
		TestAddFoodGroup();
	}

	public static void TestAddFoodGroup() {
		FoodGroup foodGroup = new FoodGroup();
		foodGroup.setname("foodGroup1");
		Food food = new Food();
		food.setname("food3");
		List<Food> foods = new ArrayList<Food>();
		foods.add(food);
		foodGroup.linkFoodsToFoodGroup(foods);
		foodGroupSvcRemote.addFoodGroup(foodGroup);
	}

}
