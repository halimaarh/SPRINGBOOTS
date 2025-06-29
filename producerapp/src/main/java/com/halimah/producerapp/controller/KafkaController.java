package com.halimah.producerapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    //using DI to inject kafka template from configuration file

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    //HTTP GET API /send?message=hello
    //Receives a message via query parameter.
    @GetMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {

        //Sends the message to kafka topic my-topic
        kafkaTemplate.send("my-topic",message);
        return  "Message sent: " + message;
    }
}
