package Util;

import java.util.HashMap;
import java.util.Map;

import model.Nutrient;

public class NutrientUtil {
	private static String[] titles = App.getTitles();

	public static Map<Nutrient, Object> getNutrientsMapFromEntry(
			String[] strings) {
		Map<Nutrient, Object> mapNutrients = new HashMap<Nutrient, Object>();
		for (int i = 4; i < strings.length; i++) {
			strings[i] = strings[i].replace(",", ".");
			if (strings[i].equalsIgnoreCase("-")) {
				strings[i] = "0";
			}
			try {
				Float float1 = Float.valueOf(strings[i]);
				mapNutrients.put(getNutrientFromEntry(i), float1);
			} catch (NumberFormatException e) {
				mapNutrients.put(getNutrientFromEntry(i), strings[i]);
			}
		}
		return mapNutrients;
	}

	public static Nutrient getNutrientFromEntry(int i) {
		int id = Integer
				.valueOf(titles[i].substring(0, titles[i].indexOf(" ")));
		String name = titles[i].substring(titles[i].indexOf(" ") + 1,
				titles[i].indexOf("(") - 1);
		String unit = titles[i].substring(
				titles[i].indexOf("(", titles[i].indexOf("(")) + 1,
				titles[i].indexOf(")"));
		Nutrient nutrient = new Nutrient(id, name, unit);
		return nutrient;
	}
}
