package com.nit.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.nit.model.User;

@Component
public class KafkaProducer {

	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;

	private static final String TOPIC = "kafkaTopic1";

	public String producer(User user) {
		kafkaTemplate.send(TOPIC, user);
		return "Produce Successfully";
	}
}
