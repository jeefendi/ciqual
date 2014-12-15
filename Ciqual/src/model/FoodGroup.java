package model;

public class FoodGroup {
	private int id;
	private String desc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public FoodGroup(int id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public FoodGroup() {
	}

}
