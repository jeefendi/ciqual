package model;

import java.util.Map;

public class Food {
	private int id;
	private String name;
	private Map<Nutrient, Object> mapNutriments;
	private FoodGroup fGroup;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Nutrient, Object> getMapNutriments() {
		return mapNutriments;
	}

	public void setMapNutriments(Map<Nutrient, Object> mapNutriments) {
		this.mapNutriments = mapNutriments;
	}

	public FoodGroup getfGroup() {
		return fGroup;
	}

	public void setfGroup(FoodGroup fGroup) {
		this.fGroup = fGroup;
	}

	public Food(int id, String name, Map<Nutrient, Object> map, FoodGroup fGroup) {
		this.id = id;
		this.name = name;
		this.mapNutriments = map;
		this.fGroup = fGroup;
	}

	public Food() {

	}

}
