package com.olteanuflorin86.msscbeerinventoryservicev1.web.mappers;

import org.mapstruct.Mapper;

import com.olteanuflorin86.msscbeerinventoryservicev1.domain.BeerInventory;
import com.olteanuflorin86.msscbeerinventoryservicev1.web.model.BeerInventoryDto;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

	BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDto);
	
	BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
	
}
