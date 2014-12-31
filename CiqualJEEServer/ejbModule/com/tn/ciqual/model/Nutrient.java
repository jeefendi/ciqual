package com.tn.ciqual.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Nutrient
 *
 */
@Entity
public class Nutrient implements Serializable {

	private Integer Id;
	private String Name;
	private String Unite;
	private List<NutritiveValue> nutritions;
	private static final long serialVersionUID = 1L;

	public Nutrient() {
		super();
	}

	@Id
	public Integer getId() {
		return this.Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}

	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getUnite() {
		return this.Unite;
	}

	public void setUnite(String Unite) {
		this.Unite = Unite;
	}

	@OneToMany(mappedBy = "nutrient")
	public List<NutritiveValue> getNutritions() {
		return nutritions;
	}

	public void setNutritions(List<NutritiveValue> nutritions) {
		this.nutritions = nutritions;
	}

}
