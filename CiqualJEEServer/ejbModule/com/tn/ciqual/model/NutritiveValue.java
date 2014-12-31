package com.tn.ciqual.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Nutrition
 *
 */
@Entity
public class NutritiveValue implements Serializable {

	private static final long serialVersionUID = 1L;

	private NutritiveValueId nutritionId;
	private Food food;
	private Nutrient nutrient;

	@EmbeddedId
	public NutritiveValueId getNutritionId() {
		return nutritionId;
	}

	public void setNutritionId(NutritiveValueId nutritionId) {
		this.nutritionId = nutritionId;
	}

	@ManyToOne
	@JoinColumn(name = "NutrientId", referencedColumnName = "id", insertable = false, updatable = false)
	public Nutrient getNutrient() {
		return nutrient;
	}

	public void setNutrient(Nutrient nutrient) {
		this.nutrient = nutrient;
	}

	@ManyToOne
	@JoinColumn(name = "FoodId", referencedColumnName = "id", insertable = false, updatable = false)
	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public NutritiveValue() {
	}

	public NutritiveValue(NutritiveValueId nutritionId, Food food,
			Nutrient nutrient) {
		this.nutritionId = nutritionId;
		this.food = food;
		this.nutrient = nutrient;
	}

}
