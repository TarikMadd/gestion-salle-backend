package com.ensa.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Evenement implements Serializable{


	@Id 
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="EventId")
	private String id;
	private String nom;
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date dateDebut;
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date dateFin;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Personne organisateur;
	
	@OneToMany(targetEntity = Tache.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "tache_event_id")
	private List<Tache> programme;
	
	@OneToOne(cascade = CascadeType.MERGE )
	//@JoinTable(name="Reservation",
	//joinColumns={@JoinColumn(name="EventId")},
	//inverseJoinColumns={@JoinColumn(name="salleId")})
	private Salle salle;
	boolean isReserverd=false;
	public Evenement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Evenement(String nom, Date dateDebut, Date dateFin, List<Tache> programme, Salle salles,Personne perso) {
		super();
		this.nom = nom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.programme = programme;
		this.salle = salles;
		this.organisateur=perso;
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
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public List<Tache> getProgramme() {
		return programme;
	}
	public void setProgramme(List<Tache> programme) {
		this.programme = programme;
	}
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salles) {
		this.salle = salles;
	}
	public Personne getPersonne() {
		return organisateur;
	}
	public void setPersonne(Personne personne) {
		this.organisateur = personne;
	}
	public Personne getOrganisateur() {
		return organisateur;
	}
	public void setOrganisateur(Personne organisateur) {
		this.organisateur = organisateur;
	}
	public boolean isReserverd() {
		return isReserverd;
	}
	public void setReserverd(boolean isReserverd) {
		this.isReserverd = isReserverd;
	}
	

	
}
