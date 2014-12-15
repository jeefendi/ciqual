package Util;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Food;

import com.opencsv.CSVReader;

public class CsvToXml {
	private static String[] titles = null;

	public static String[] getTitles() {
		return titles;
	}

	public static void setTitles(String[] titles) {
		CsvToXml.titles = titles;
	}

	public List<String[]> csvToList() {
		List<String[]> entries = null;
		try {
			CSVReader reader = new CSVReader(new FileReader(
					"Resources/ciqual.csv"), ';');
			entries = reader.readAll();
			reader.close();
			setTitles(entries.get(0));
		} catch (IOException e) {
			System.out.println("CSV File not found");
		}
		return entries;
	}

	public List<Food> getFoodList(List<String[]> entries) {
		List<Food> foods = new ArrayList<Food>();
		Food food = new Food();
		for (int i = 1; i < entries.size(); i++) {
			food = FoodUtil.getFoodFromEntry(entries.get(i));
			foods.add(food);
		}
		return foods;
	}
}
