package com.myproject.rabbitmq.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("rabbitmq://localhost:5672/sharath-exchange?autoDelete=false&durable=false&queue=sharath-queue&routingKey=sharath-key")
				.to("log:?level=INFO&showBody=true");
	}

}
