package com.halimah.webclientuserservice.service;

import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

public class RestApiService {
    public List getStudentWitCLient(){

        WebClient.Builder builder = WebClient.builder();
        String url = "http://localhost:8080/api/v1/students";

        List students = builder.build()
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(List.class)
                .block();

        return students;
    }
}
