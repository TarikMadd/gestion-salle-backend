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

import com.ensa.models.Salle;
import com.ensa.models.Tache;
import com.ensa.services.interfaces.ISalleService;
import com.ensa.services.interfaces.ITacheService;

@RestController
@RequestMapping("/api/salles")
@CrossOrigin
public class SalleController {
	@Autowired
	ISalleService salleService;
	
	@GetMapping
	public List<Salle> getSalles() {
		return salleService.getSalles();
	}
	
	@PostMapping
	public void addTache(@RequestBody Salle salle) {
		salleService.addSalle(salle);
	}
	
	@PutMapping
	public void updateSalle(@RequestBody Salle salle) {
		salleService.updateSalle(salle);
	}
	
	@DeleteMapping("/{id}")
	public void deleteSalle(@PathVariable String id) {
		salleService.deleteSalle(id);
	}
	
	
	}
