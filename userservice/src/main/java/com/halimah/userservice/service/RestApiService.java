package com.halimah.userservice.service;

import com.halimah.userservice.controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.List;

@Service
public class RestApiService {
    @Autowired
    private RestTemplate restTemplate;

    public RestApiService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public List getStudents(){
        String url = "http://localhost:8080/api/v1/students";
        return restTemplate.getForObject(url, List.class);
    }

    record Student(Long studentId, String studentName, LocalDate dateOfBirth,
                   String studentAddress){}

    public String createStudent(Object student) {
        String url = "http://localhost:8080/api/v1/students";
        ResponseEntity<Student> stud = restTemplate.postForEntity(url,student,Student.class);
        return "Done";
    }
}
