package com.myproject.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueueController {

	@Autowired
	private Producer producer;
	
	@RequestMapping(value="/send", method = RequestMethod.POST)
	public ResponseEntity<Void> send(@RequestBody String msg) {
		producer.sendMsg(msg);
		return ResponseEntity.noContent().build();
	}
}
