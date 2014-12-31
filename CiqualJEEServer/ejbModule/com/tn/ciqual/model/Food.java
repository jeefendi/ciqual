package com.tn.ciqual.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	private List<NutritiveValue> nutritiveValues;

	public Food() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
			List<NutritiveValue> nutritiveValues) {
		this.id = id;
		this.name = name;
		this.foodGroup = foodGroup;
		this.nutritiveValues = nutritiveValues;
	}

	@OneToMany(mappedBy = "food", fetch = FetchType.EAGER)
	public List<NutritiveValue> getnutritiveValues() {
		return nutritiveValues;
	}

	public void setnutritiveValues(List<NutritiveValue> nutritiveValues) {
		this.nutritiveValues = nutritiveValues;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", foodGroup=" + foodGroup
				+ ", nutritiveValues=" + nutritiveValues + "]";
	}

}
