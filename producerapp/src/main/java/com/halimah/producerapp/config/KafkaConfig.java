package com.halimah.producerapp.config;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConfig {
    //creates a producer factory - this is used to create Kafka producers
    @Bean
    ProducerFactory<String, String> producerFactory(){
        //creating configuration object as a hashmap
        Map<String, Object> configProps = new HashMap<>();

        // Configuring Kafka Broker address as localhost:9092
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092"); //SERVER

        //keys and values will be serialized as Strings when sent to Kafka
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class);

        //return a  DefaultKafkaProducerFactory which will produce
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean
    KafkaTemplate<String, String> kafkaTemplate(){
        //Create a kafka template , which is a high level spring helper
        //to send messages easily to Kafka
        return new KafkaTemplate<>(producerFactory());
    }

}
