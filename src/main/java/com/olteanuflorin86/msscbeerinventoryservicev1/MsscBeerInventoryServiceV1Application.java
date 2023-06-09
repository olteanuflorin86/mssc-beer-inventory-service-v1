package com.olteanuflorin86.msscbeerinventoryservicev1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisAutoConfiguration;

@SpringBootApplication(exclude = ArtemisAutoConfiguration.class)
public class MsscBeerInventoryServiceV1Application {

	public static void main(String[] args) {
		SpringApplication.run(MsscBeerInventoryServiceV1Application.class, args);
	}

}
