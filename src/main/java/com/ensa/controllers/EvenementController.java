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

import com.ensa.models.Evenement;
import com.ensa.models.Salle;
import com.ensa.services.interfaces.IEvenementService;
import com.ensa.services.interfaces.ISalleService;

@RestController
@RequestMapping("/api/evenements")
@CrossOrigin
public class EvenementController {
	@Autowired
	private IEvenementService eventService;
	
	@GetMapping
	public List<Evenement> getevents() {
		return eventService.getEvenements();
	}
	
	@GetMapping("/active")
	public List<Evenement> getActiveevents() {
		return eventService.getActiveEvenements();
	}
	
	@PostMapping
	public void addEvent(@RequestBody Evenement event) {
		eventService.addEvenement(event);
	}
	
	@PutMapping
	public void updateEvent(@RequestBody Evenement event) {
		eventService.updateEvenement(event);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEvent(@PathVariable String id) {
		eventService.deleteEvenement(id);
	}
	
	
}
