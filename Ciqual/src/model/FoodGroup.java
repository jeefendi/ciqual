package model;

public class FoodGroup {
	private String id;
	private String desc;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public FoodGroup(String id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public FoodGroup() {
	}

}
