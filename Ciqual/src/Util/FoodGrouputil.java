package Util;

import model.FoodGroup;

public class FoodGrouputil {
	public static FoodGroup getFgFromEntry(String[] strings) {
		int id = Integer.parseInt(strings[0]);
		String desc = strings[1];
		FoodGroup foodGroup = new FoodGroup(id, desc);
		return foodGroup;
	}
}
