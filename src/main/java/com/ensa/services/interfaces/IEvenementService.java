package com.ensa.services.interfaces;

import java.util.List;

import com.ensa.models.Evenement;

public interface IEvenementService {

	public List<Evenement> getEvenements();
	public List<Evenement> getActiveEvenements();
	public void addEvenement (Evenement emp);
	public void updateEvenement(Evenement emp);
	public void deleteEvenement(String id);

}
