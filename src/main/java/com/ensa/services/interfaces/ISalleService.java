package com.ensa.services.interfaces;

import java.util.List;

import com.ensa.models.Equipement;
import com.ensa.models.Salle;

public interface ISalleService {


	public List<Salle> getSalles();
	public void addSalle(Salle emp);
	public void updateSalle(Salle emp);
	public void deleteSalle(String id);
}
