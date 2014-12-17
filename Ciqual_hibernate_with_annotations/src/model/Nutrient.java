package model;


public class Nutrient {
	private int id;
	private String name;
	private String unit;

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

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Nutrient() {
	}

	public Nutrient(int id, String name, String unit) {
		this.id = id;
		this.name = name;
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Nutrient [id=" + id + ", name=" + name + ", unit=" + unit + "]";
	}

}
