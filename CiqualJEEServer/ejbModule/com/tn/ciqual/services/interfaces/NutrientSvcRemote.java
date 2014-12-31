package com.tn.ciqual.services.interfaces;

import javax.ejb.Remote;

import com.tn.ciqual.model.Nutrient;

@Remote
public interface NutrientSvcRemote {
	boolean addNutrient(Nutrient nutrient);

	boolean removeNutrient(Nutrient nutrient);

	boolean updateNutrient(Nutrient nutrient);

	Nutrient findNutrientById(Integer id);

}
