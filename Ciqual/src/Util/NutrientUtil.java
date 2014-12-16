package Util;

import java.util.HashMap;
import java.util.Map;

import model.Nutrient;

public class NutrientUtil {

	public static Map<Nutrient, Object> getNutrientsMapFromEntry(
			String[] strings) {
		Map<Nutrient, Object> mapNutrients = new HashMap<Nutrient, Object>();
		Nutrient nutrient = null;
		for (int i = 4; i < strings.length; i++) {
			nutrient = new Nutrient(i - 4, App.getTitles()[i]);
			strings[i] = strings[i].replace(",", ".");
			if (strings[i].equalsIgnoreCase("-")) {
				strings[i] = "0";
			}
			try {
				Float float1 = Float.valueOf(strings[i]);
				mapNutrients.put(nutrient, float1);
			} catch (NumberFormatException e) {
				mapNutrients.put(nutrient, strings[i]);
			}
		}
		return mapNutrients;
	}
}
