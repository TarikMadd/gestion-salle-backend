package com.ensa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensa.models.Equipement;

@Repository
public interface EquipementRepository extends JpaRepository<Equipement, String>{

}
