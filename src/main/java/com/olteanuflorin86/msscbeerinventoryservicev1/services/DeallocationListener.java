package com.olteanuflorin86.msscbeerinventoryservicev1.services;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.olteanuflorin86.brewery.model.events.DeallocateOrderRequest;
import com.olteanuflorin86.msscbeerinventoryservicev1.config.JmsConfig;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Component
public class DeallocationListener {

    private final AllocationService allocationService;

    @JmsListener(destination = JmsConfig.DEALLOCATE_ORDER_QUEUE)
    public void listen(DeallocateOrderRequest request){
        allocationService.deallocateOrder(request.getBeerOrderDto());
    }
}
