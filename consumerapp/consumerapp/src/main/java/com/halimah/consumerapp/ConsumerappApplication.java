package com.halimah.consumerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConsumerappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerappApplication.class, args);
	}

	@KafkaListener(topics = "my-topic", groupId = "my-group-id")
	public void listen(String message){
		System.out.println("Received message: " + message);
	}

}
