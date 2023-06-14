package com.olteanuflorin86.msscbeerinventoryservicev1.services;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.olteanuflorin86.common.events.NewInventoryEvent;
import com.olteanuflorin86.msscbeerinventoryservicev1.config.JmsConfig;
import com.olteanuflorin86.msscbeerinventoryservicev1.domain.BeerInventory;
import com.olteanuflorin86.msscbeerinventoryservicev1.repositories.BeerInventoryRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Component
public class NewInventoryListener {

    private final BeerInventoryRepository beerInventoryRepository;

    @JmsListener(destination = JmsConfig.NEW_INVENTORY_QUEUE)
    public void listen(NewInventoryEvent event){

        log.debug("Got Inventory: " + event.toString());

        beerInventoryRepository.save(BeerInventory.builder()
                .beerId(event.getBeerDto().getId())
                .upc(event.getBeerDto().getUpc())
                .quantityOnHand(event.getBeerDto().getQuantityOnHand())
                .build());
    }

}
