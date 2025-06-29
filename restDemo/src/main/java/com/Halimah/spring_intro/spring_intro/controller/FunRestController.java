package com.Halimah.spring_intro.spring_intro.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

//    @Value("${coach.name}")
//    private String coachName;
//
//    @Value("${coach.team}")
//    private String clubName;

//    @Value("${manager.name}")
//    private String managerName;
//
//    @Value("${club.name}")
//    private String clubName;
//
//    //expose "/" endpoint that returns ""
//    @GetMapping("/")
//    public String sayHello() {
//        return managerName + " is the manager of " + clubName;
//    }

    @GetMapping("welcome")
    public String welcomeApi() {
        return "This is our Welcome Endpoint";
    }

    @GetMapping("Halimah")
    public String Api() {
        return "This is Halimah's Endpoint";
    }



}