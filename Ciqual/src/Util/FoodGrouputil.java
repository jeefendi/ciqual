package Util;

import model.FoodGroup;

public class FoodGrouputil {
	public static FoodGroup getFgFromEntry(String[] strings) {
		String id = strings[0];
		String desc = strings[1];
		FoodGroup foodGroup = new FoodGroup(id, desc);
		return foodGroup;
	}
}
