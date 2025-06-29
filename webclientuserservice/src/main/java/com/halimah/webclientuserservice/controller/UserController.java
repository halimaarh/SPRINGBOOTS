package com.halimah.webclientuserservice.controller;

import com.halimah.webclientuserservice.service.RestApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @Autowired
    RestApiService restApiService;

    @GetMapping("/getstudentFLux")
    public List getStudentsFlux(){
        return restApiService.getStudentWitCLient();

    }
}
