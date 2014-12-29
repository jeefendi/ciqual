package com.tn.ciqual.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Food
 *
 */
@Entity
public class Food implements Serializable {

	private int ORIGFDCD;
	private String ORIGFDNM;
	private static final long serialVersionUID = 1L;
	private FoodGroup foodGroup;

	public Food() {
		super();
	}

	@Id
	public int getORIGFDCD() {
		return this.ORIGFDCD;
	}

	public void setORIGFDCD(int ORIGFDCD) {
		this.ORIGFDCD = ORIGFDCD;
	}

	public String getORIGFDNM() {
		return this.ORIGFDNM;
	}

	public void setORIGFDNM(String ORIGFDNM) {
		this.ORIGFDNM = ORIGFDNM;
	}

	@ManyToOne
	public FoodGroup getFoodGroup() {
		return foodGroup;
	}

	public void setFoodGroup(FoodGroup foodGroup) {
		this.foodGroup = foodGroup;
	}

}
