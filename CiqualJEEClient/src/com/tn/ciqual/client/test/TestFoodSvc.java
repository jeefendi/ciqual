package com.tn.ciqual.client.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.tn.ciqual.model.Food;
import com.tn.ciqual.model.FoodGroup;
import com.tn.ciqual.services.interfaces.FoodSvcRemote;

public class TestFoodSvc {
	private static FoodSvcRemote foodSvcRemote = (FoodSvcRemote) getProxy("ejb:/CiqualJEE/FoodSvc!"
			+ FoodSvcRemote.class.getCanonicalName());

	public static void main(String[] args) {
		testAddFood();
		testFindFoodById();
	}

	private static void testAddFood() {
		foodSvcRemote
				.addFood(new Food(1, "Crème", new FoodGroup(21, "Sucres")));
		foodSvcRemote.addFood(new Food(2, "Spaghetti", new FoodGroup(22,
				"Pâtes")));
	}

	private static void testFindFoodById() {
		Food food1 = foodSvcRemote.findFoodById(1);
		System.out.println("id=" + food1.getORIGFDCD() + " | name="
				+ food1.getORIGFDNM() + " | groupe="
				+ food1.getFoodGroup().getORIGGPFR());
		Food food2 = foodSvcRemote.findFoodById(2);
		System.out.println("id=" + food2.getORIGFDCD() + " | name="
				+ food2.getORIGFDNM() + " | groupe="
				+ food2.getFoodGroup().getORIGGPFR());
	}

	public static Object getProxy(String jndiName) {
		Object proxy = null;
		try {
			Context context = new InitialContext();
			proxy = context.lookup(jndiName);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return proxy;
	}

}
