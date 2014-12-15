package Util;

import java.util.HashMap;
import java.util.Map;

import model.Nutrient;

public class NutrientUtil {

	public static Map<Nutrient, Float> getNutrientsMapFromEntry(String[] strings) {
		Map<Nutrient, Float> mapNutrients = new HashMap<Nutrient, Float>();
		Nutrient nutrient = null;
		for (int i = 4; i < strings.length; i++) {
			nutrient = new Nutrient(i - 4, CsvToXml.getTitles()[i]);
			mapNutrients.put(nutrient, Float.valueOf(strings[i]));
		}
		return mapNutrients;
	}
}
