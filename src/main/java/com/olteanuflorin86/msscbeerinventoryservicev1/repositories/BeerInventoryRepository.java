package com.olteanuflorin86.msscbeerinventoryservicev1.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.olteanuflorin86.msscbeerinventoryservicev1.domain.BeerInventory;

@Repository
public interface BeerInventoryRepository extends JpaRepository<BeerInventory, UUID>{

	List<BeerInventory> findAllByBeerId(UUID beerId);
	
	List<BeerInventory> findAllByUpc(String upc);
}
