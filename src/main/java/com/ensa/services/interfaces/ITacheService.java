package com.ensa.services.interfaces;

import java.util.List;


import com.ensa.models.Tache;

public interface ITacheService {

	public List<Tache> getTaches();
	public void addTache(Tache emp);
	public void updateTache(Tache emp);
	public void deleteTache(String id);
}
