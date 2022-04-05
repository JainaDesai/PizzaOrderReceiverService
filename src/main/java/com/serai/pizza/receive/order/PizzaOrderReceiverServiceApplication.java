package com.serai.pizza.receive.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

 /**
 * @author Jaina
 */

@SpringBootApplication
@ComponentScan("com.serai.pizza.receive.order")
public class PizzaOrderReceiverServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaOrderReceiverServiceApplication.class, args);
		System.out.println("Welcome to Pizza Order Receiving Service");
	}

}
