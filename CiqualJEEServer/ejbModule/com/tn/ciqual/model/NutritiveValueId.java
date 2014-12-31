package com.tn.ciqual.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class NutritiveValueId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer FoodId;
	private Integer NutrientId;
	private String Quantite;

	public Integer getFoodId() {
		return FoodId;
	}

	public void setFoodId(Integer foodId) {
		FoodId = foodId;
	}

	public Integer getNutrientId() {
		return NutrientId;
	}

	public void setNutrientId(Integer nutrientId) {
		NutrientId = nutrientId;
	}

	public NutritiveValueId() {
	}

	public String getQuantite() {
		return Quantite;
	}

	public void setQuantite(String quantite) {
		Quantite = quantite;
	}

	public NutritiveValueId(Integer foodId, Integer nutrientId, String quantite) {
		FoodId = foodId;
		NutrientId = nutrientId;
		Quantite = quantite;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FoodId == null) ? 0 : FoodId.hashCode());
		result = prime * result
				+ ((NutrientId == null) ? 0 : NutrientId.hashCode());
		result = prime * result
				+ ((Quantite == null) ? 0 : Quantite.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NutritiveValueId other = (NutritiveValueId) obj;
		if (FoodId == null) {
			if (other.FoodId != null)
				return false;
		} else if (!FoodId.equals(other.FoodId))
			return false;
		if (NutrientId == null) {
			if (other.NutrientId != null)
				return false;
		} else if (!NutrientId.equals(other.NutrientId))
			return false;
		if (Quantite == null) {
			if (other.Quantite != null)
				return false;
		} else if (!Quantite.equals(other.Quantite))
			return false;
		return true;
	}

}
