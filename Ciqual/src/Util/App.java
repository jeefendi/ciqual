package Util;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Food;

import com.opencsv.CSVReader;
import com.thoughtworks.xstream.XStream;

public class App {
	private static String[] titles = null;

	public static String[] getTitles() {
		return titles;
	}

	public static void setTitles(String[] titles) {
		App.titles = titles;
	}

	public static List<String[]> csvToList() {
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

	public static List<Food> getFoodList(List<String[]> entries) {
		List<Food> foods = new ArrayList<Food>();
		Food food = new Food();
		for (int i = 1; i < entries.size(); i++) {
			food = FoodUtil.getFoodFromEntry(entries.get(i));
			foods.add(food);
		}
		return foods;
	}

	public static String ListtoXml() {
		List<String[]> entries = csvToList();
		List<Food> foodList = getFoodList(entries);
		XStream stream = new XStream();
		String xml = stream.toXML(foodList);
		return xml;
	}

	public static void main(String[] args) {
		String xml = ListtoXml();
		System.out.println(xml);
	}
}
