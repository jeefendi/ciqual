package com.tn.ciqual.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: FoodGroup
 *
 */
@Entity
public class FoodGroup implements Serializable {

	private int id;
	private String name;
	private static final long serialVersionUID = 1L;
	private List<Food> foods;

	public FoodGroup() {
		super();
	}

	@Id
	public int getid() {
		return this.id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getname() {
		return this.name;
	}

	public void setname(String name) {
		this.name = name;
	}

	@OneToMany(mappedBy = "foodGroup", cascade = CascadeType.PERSIST)
	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	public FoodGroup(int id, String name, List<Food> foods) {
		this.id = id;
		this.name = name;
		this.foods = foods;
	}

	public FoodGroup(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void linkFoodsToFoodGroup(List<Food> foods) {
		this.foods = foods;
		for (Food food : foods) {
			food.setFoodGroup(this);
		}
	}

}
