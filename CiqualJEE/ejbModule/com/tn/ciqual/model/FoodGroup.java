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

	private int ORIGGPCD;
	private String ORIGGPFR;
	private static final long serialVersionUID = 1L;
	private List<Food> foods;

	public FoodGroup() {
		super();
	}

	@Id
	public int getORIGGPCD() {
		return this.ORIGGPCD;
	}

	public void setORIGGPCD(int ORIGGPCD) {
		this.ORIGGPCD = ORIGGPCD;
	}

	public String getORIGGPFR() {
		return this.ORIGGPFR;
	}

	public void setORIGGPFR(String ORIGGPFR) {
		this.ORIGGPFR = ORIGGPFR;
	}

	@OneToMany(mappedBy = "foodGroup", cascade = CascadeType.PERSIST)
	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	public FoodGroup(int oRIGGPCD, String oRIGGPFR, List<Food> foods) {
		ORIGGPCD = oRIGGPCD;
		ORIGGPFR = oRIGGPFR;
		this.foods = foods;
	}

	public FoodGroup(int oRIGGPCD, String oRIGGPFR) {
		ORIGGPCD = oRIGGPCD;
		ORIGGPFR = oRIGGPFR;
	}

	public void linkFoodsToFoodGroup(List<Food> foods) {
		this.foods = foods;
		for (Food food : foods) {
			food.setFoodGroup(this);
		}
	}

}
