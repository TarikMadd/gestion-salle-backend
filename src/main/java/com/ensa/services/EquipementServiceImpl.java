package com.ensa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.models.Equipement;
import com.ensa.repositories.EquipementRepository;
import com.ensa.repositories.PersonneRepository;
import com.ensa.services.interfaces.IEquipementService;

@Service
public class EquipementServiceImpl implements IEquipementService{

	@Autowired
	private EquipementRepository equipementRepo;
	
	@Override
	public List<Equipement> getEquipements() {
		// TODO Auto-generated method stub
		return equipementRepo.findAll();
	}

	@Override
	public void addEquipement(Equipement emp) {
		// TODO Auto-generated method stub
		equipementRepo.save(emp);
	}

	@Override
	public void updateEquipement(Equipement emp) {
		// TODO Auto-generated method stub
		equipementRepo.save(emp);
	}

	@Override
	public void deleteEquipement(String id) {
		// TODO Auto-generated method stub
		equipementRepo.deleteById(id);
	}
	

}
