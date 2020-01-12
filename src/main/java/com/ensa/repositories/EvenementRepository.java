package com.ensa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ensa.models.Evenement;

@Repository
public interface EvenementRepository extends JpaRepository<Evenement, String>{

	 @Query("SELECT e FROM Evenement e WHERE e.isReserverd = true " )
	    List<Evenement> findAcceptedEvents();
}
