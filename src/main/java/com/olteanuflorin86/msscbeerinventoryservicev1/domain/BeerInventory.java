package com.olteanuflorin86.msscbeerinventoryservicev1.domain;

import java.sql.Timestamp; 
import java.util.UUID;

import javax.persistence.Entity;

import lombok.Builder;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
@Entity
public class BeerInventory extends BaseEntity {

	public BeerInventory() {
		super();
	}
	
	@Builder
    public BeerInventory(UUID id, Long version, Timestamp createdDate, Timestamp lastModifiedDate, UUID beerId,
                         String upc, Integer quantityOnHand) {
        super(id, version, createdDate, lastModifiedDate);
        this.beerId = beerId;
        this.upc = upc;
        this.quantityOnHand = quantityOnHand;
    }

    private UUID beerId;
    private String upc;
    private Integer quantityOnHand = 0;
}
