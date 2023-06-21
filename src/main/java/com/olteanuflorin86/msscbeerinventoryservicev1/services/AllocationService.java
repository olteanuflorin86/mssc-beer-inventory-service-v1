package com.olteanuflorin86.msscbeerinventoryservicev1.services;

import com.olteanuflorin86.brewery.model.BeerOrderDto;

public interface AllocationService {

	Boolean allocateOrder(BeerOrderDto beerOrderDto);
}
