package com.ensa.services.interfaces;

import java.util.List;

import com.ensa.models.Equipement;


public interface IEquipementService {

	public List<Equipement> getEquipements();
	public void addEquipement(Equipement emp);
	public void updateEquipement(Equipement emp);
	public void deleteEquipement(String id);
}
