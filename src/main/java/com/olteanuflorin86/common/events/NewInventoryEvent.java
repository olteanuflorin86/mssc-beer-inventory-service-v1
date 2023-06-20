package com.olteanuflorin86.common.events;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2185306204714991382L;

	public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}