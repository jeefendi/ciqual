package Util;

import java.util.HashMap;
import java.util.Map;

import model.Nutrient;

public class NutrientUtil {

	public static Map<Nutrient, Float> getNutrientsMapFromEntry(String[] strings) {
		Map<Nutrient, Float> mapNutrients = new HashMap<Nutrient, Float>();
		Nutrient nutrient = null;
		for (int i = 4; i < strings.length; i++) {
			nutrient = new Nutrient(i - 4, App.getTitles()[i]);
			strings[i] = strings[i].replace(",", ".");
			if (strings[i].equals("-")) {
				strings[i] = "0";
			} else if (strings[i].startsWith("< ")) {
				strings[i] = strings[i].replace("< ", "");
			} else if (strings[i].equalsIgnoreCase("traces")) {
				strings[i] = "0";
			}
			System.out.println(strings[i]);
			mapNutrients.put(nutrient, Float.valueOf(strings[i]));
		}
		return mapNutrients;
	}
}
