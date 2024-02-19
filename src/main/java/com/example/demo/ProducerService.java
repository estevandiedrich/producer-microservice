package com.example.demo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
	@Autowired
	private RabbitTemplate rabbitTemplate;
	@Value("${spring.rabbitmq.exchange}")
	private String exchange;
	@Value("${spring.rabbitmq.routingkey}")
	private String routingKey;
	public void sendMessage(User user) {
		rabbitTemplate.convertAndSend(exchange, routingKey, user);
	}
}
