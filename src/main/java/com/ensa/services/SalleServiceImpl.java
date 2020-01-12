package com.ensa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.models.Salle;
import com.ensa.repositories.SalleRepository;
import com.ensa.services.interfaces.ISalleService;

@Service
public class SalleServiceImpl implements ISalleService{

	@Autowired
	private SalleRepository salleRepo;
	
	@Override
	public List<Salle> getSalles() {
		// TODO Auto-generated method stub
		return salleRepo.findAll();
	}

	@Override
	public void addSalle(Salle emp) {
		// TODO Auto-generated method stub
		salleRepo.save(emp);
	}

	@Override
	public void updateSalle(Salle emp) {
		// TODO Auto-generated method stub
		salleRepo.save(emp);
	}

	@Override
	public void deleteSalle(String id) {
		// TODO Auto-generated method stub
		salleRepo.deleteById(id);
	}

}
