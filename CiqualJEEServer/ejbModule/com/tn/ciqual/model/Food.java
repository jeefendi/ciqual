package com.tn.ciqual.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Food
 *
 */
@Entity
public class Food implements Serializable {

	private int id;
	private String name;
	private static final long serialVersionUID = 1L;
	private FoodGroup foodGroup;
	private List<NutritiveValue> nutritions;

	public Food() {
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

	@ManyToOne(cascade = CascadeType.PERSIST)
	public FoodGroup getFoodGroup() {
		return foodGroup;
	}

	public void setFoodGroup(FoodGroup foodGroup) {
		this.foodGroup = foodGroup;
	}

	public Food(int id, String name, FoodGroup foodGroup,
			List<NutritiveValue> nutritions) {
		this.id = id;
		this.name = name;
		this.foodGroup = foodGroup;
		this.nutritions = nutritions;
	}

	@OneToMany(mappedBy = "food")
	public List<NutritiveValue> getNutritions() {
		return nutritions;
	}

	public void setNutritions(List<NutritiveValue> nutritions) {
		this.nutritions = nutritions;
	}
	
}
