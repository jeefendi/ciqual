package Util;

import java.util.Map;

import model.Food;
import model.FoodGroup;
import model.Nutrient;

public class FoodUtil {

	public static Food getFoodFromEntry(String[] strings) {
		Food food = null;
		Map<Nutrient, Object> map = NutrientUtil
				.getNutrientsMapFromEntry(strings);
		FoodGroup foodGroup = FoodGrouputil.getFgFromEntry(strings);
		food = new Food(Integer.parseInt(strings[2]), strings[3], foodGroup,
				map);
		return food;
	}
}
