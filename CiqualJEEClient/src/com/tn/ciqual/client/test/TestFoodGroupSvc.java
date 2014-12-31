package com.tn.ciqual.client.test;

import java.util.Set;
import java.util.TreeSet;

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
		Set<Food> foods = new TreeSet<Food>();
		foods.add(food);
		foodGroup.linkFoodsToFoodGroup(foods);
		foodGroupSvcRemote.addFoodGroup(foodGroup);
	}

}
