package com.myproject.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {

	@Autowired
	RabbitTemplate rabbitTemplate;
	
	public void sendMsg(String msg) {
		int i = 0;
		while(i < 10) {
			rabbitTemplate.convertAndSend(RabbitmqClientApplication.queueName, msg);
			System.out.println("sent message -----> " +msg);
			i++;
		}
	}
}
