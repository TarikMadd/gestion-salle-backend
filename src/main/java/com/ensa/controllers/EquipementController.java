package com.ensa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ensa.models.Equipement;
import com.ensa.models.Tache;
import com.ensa.services.interfaces.IEquipementService;

@RestController
@RequestMapping("/api/equipements")
@CrossOrigin
public class EquipementController {

	@Autowired
	private IEquipementService equipementService;
	
	@GetMapping
	public List<Equipement> getEquipements() {
		return equipementService.getEquipements();
	}
	
	@PostMapping
	public void addEquipement(@RequestBody Equipement e) {
		equipementService.addEquipement(e);
	}
	
	@PutMapping
	public void updateEquipement(@RequestBody Equipement e) {
		equipementService.updateEquipement(e);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEquipement(@PathVariable String id) {
		equipementService.deleteEquipement(id);
	}
	

}
