package com.ensa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.models.Tache;
import com.ensa.repositories.TacheRepository;
import com.ensa.services.interfaces.ITacheService;

@Service
public class TacheServiceImpl implements ITacheService{

	@Autowired
	private TacheRepository tacheRepo;
	@Override
	public List<Tache> getTaches() {
		// TODO Auto-generated method stub
		return tacheRepo.findAll();
	}

	@Override
	public void addTache(Tache emp) {
		// TODO Auto-generated method stub
		tacheRepo.save(emp);
	}

	@Override
	public void updateTache(Tache emp) {
		// TODO Auto-generated method stub
		tacheRepo.save(emp);
	}

	@Override
	public void deleteTache(String id) {
		// TODO Auto-generated method stub
		tacheRepo.deleteById(id);
	}
	

}
