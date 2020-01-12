package com.ensa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.models.Evenement;
import com.ensa.repositories.EvenementRepository;
import com.ensa.repositories.SalleRepository;
import com.ensa.services.interfaces.IEvenementService;

@Service
public class EvenementServiceImpl implements IEvenementService{
	
	@Autowired
	private EvenementRepository eventRepo;
	@Override
	public List<Evenement> getEvenements() {
		// TODO Auto-generated method stub
		return eventRepo.findAll();
	}

	@Override
	public void addEvenement(Evenement emp) {
		// TODO Auto-generated method stub
		eventRepo.save(emp);
	}

	@Override
	public void updateEvenement(Evenement emp) {
		// TODO Auto-generated method stub
		eventRepo.save(emp);
	}

	@Override
	public void deleteEvenement(String id) {
		// TODO Auto-generated method stub
		eventRepo.deleteById(id);
	}

	@Override
	public List<Evenement> getActiveEvenements() {
		// TODO Auto-generated method stub
		return eventRepo.findAcceptedEvents();
	}
	

}
