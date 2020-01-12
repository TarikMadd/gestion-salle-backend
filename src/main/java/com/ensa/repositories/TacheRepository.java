package com.ensa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensa.models.Tache;

@Repository
public interface TacheRepository extends JpaRepository<Tache, String>{

	
	
}

