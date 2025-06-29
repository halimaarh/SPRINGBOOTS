package com.halimah.userservice.controller;

import com.halimah.userservice.service.RestApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
//    create object of the service class
    @Autowired
RestApiService restApiService;

    public UserController(RestApiService restApiService){
        this.restApiService = restApiService;
    }

    @GetMapping("/getstudents")
    public List getStudents(){
        return restApiService.getStudents();
    }

    record Student(Long studentId, String studentName, LocalDate dateOfBirth,
                   String studentAddress){}

    @PostMapping("/createStudent")
    public String createItem(@RequestBody Student student){
        Student student1 = new Student(student.studentId(), student.studentName(),
                student.dateOfBirth(), student.studentAddress());

        return restApiService.createStudent(student1);

    }
}
