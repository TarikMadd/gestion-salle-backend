package com.ensa.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Salle implements Serializable{
	
	@Id 
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="salleId")
	private String id;
	private String nom;
	private String type;
	private int charge;
	
	@OneToMany(targetEntity = Equipement.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "salle_equipement_id")
	private List<Equipement> equipements;
	private boolean isAvailable=false;
	
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salle ( String id,String nom, String type, int charge, boolean isAvailable,List<Equipement> equipements) {
		super();
		this.id=id;
		this.nom = nom;
		this.type = type;
		this.charge = charge;
		this.isAvailable = isAvailable;
		this.equipements=equipements;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public List<Equipement> getEquipements() {
		return equipements;
	}
	public void setEquipements(List<Equipement> equipements) {
		this.equipements = equipements;
	}
	
	
	
	

}
