package com.myproject.rabbitmq;

import org.springframework.stereotype.Component;

@Component
public class Consumer {

	public void receiveMsg(String message) {
		System.out.println("received message -----> " +message);
	}
}
