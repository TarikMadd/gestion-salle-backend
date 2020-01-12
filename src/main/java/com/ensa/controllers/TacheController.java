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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ensa.models.Role;
import com.ensa.models.Tache;
import com.ensa.services.interfaces.IRoleService;
import com.ensa.services.interfaces.ITacheService;

@RestController
@RequestMapping("/api/taches")
@CrossOrigin
public class TacheController {

	@Autowired
	ITacheService tacheService;
	
	@GetMapping
	public List<Tache> getTaches() {
		return tacheService.getTaches();
	}
	
	@PostMapping
	public void addTache(@RequestBody Tache tache) {
		tacheService.addTache(tache);
	}
	
	@PutMapping
	public void updateTache(@RequestBody Tache tache) {
		tacheService.updateTache(tache);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTache(@PathVariable String id) {
		tacheService.deleteTache(id);
	}
	
	
	}
