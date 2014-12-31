package com.tn.ciqual.client.test;

import com.tn.ciqual.model.Food;
import com.tn.ciqual.model.FoodGroup;
import com.tn.ciqual.services.interfaces.FoodSvcRemote;

public class TestFoodSvc {

	private static FoodSvcRemote foodSvcRemote = (FoodSvcRemote) Proxy
			.getProxy("ejb:/CiqualJEEServer/FoodSvc!"
					+ FoodSvcRemote.class.getCanonicalName());

	public static void main(String[] args) {
		testAddFood();
		testFindFoodById();
	}

	private static void testAddFood() {
		Food food1 = new Food();
		Food food2 = new Food();
		FoodGroup foodGroup = new FoodGroup();
		foodGroup.setname("fg1");
		food1.setname("food1");
		food1.setFoodGroup(foodGroup);
		food2.setname("food2");
		food2.setFoodGroup(foodGroup);
		foodSvcRemote.addFood(food1);
		foodSvcRemote.addFood(food2);

	}

	private static void testFindFoodById() {
		Food foodFound = foodSvcRemote.findFoodById(1);
		System.out.println("Found food = " + foodFound);

	}

}
