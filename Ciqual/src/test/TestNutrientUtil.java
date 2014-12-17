package test;

import model.Nutrient;
import Util.App;
import Util.NutrientUtil;

public class TestNutrientUtil {

	public static Nutrient testGetNutrientFromEntry(int i) {
		String[] strings = { "ORIGGPCD", "ORIGGPFR", "ORIGFDCD", "ORIGFDNM",
				"10110 Sodium (mg/100g)" };
		App.setTitles(strings);
		Nutrient nutrient = NutrientUtil.getNutrientFromEntry(i);
		return nutrient;
	}

	public static void main(String[] args) {
		Nutrient nutrient = testGetNutrientFromEntry(4);
		System.out.println(nutrient);
	}
}
