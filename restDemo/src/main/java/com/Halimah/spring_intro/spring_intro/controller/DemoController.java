package com.Halimah.spring_intro.spring_intro.controller;

import com.Halimah.spring_intro.spring_intro.repository.Coach;
import com.Halimah.spring_intro.spring_intro.repository.CricketCoach;
import com.Halimah.spring_intro.spring_intro.repository.FootballCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
//    // DEPENDENCY INJECTION
//    //USING DEPENDENCY INJECTION TO INJECT CRICKETCOACH INTO DEMOCONTROLLER
//    private CricketCoach coach;
//
//    //CONSTRUCTOR INJECTION
//    @Autowired
//    public DemoController(CricketCoach coach) {
//        this.coach = coach;
//    }
//
//    @GetMapping("/dailyworkout")
//    public String getDailyWorkout(){
//        return coach.getDailyWorkout();
//    }


//    //FIELD INJECTION(This Does Not Require a constructor)
//    @Autowired
//    private CricketCoach coach;
//
//    @GetMapping("/dailyworkout")
//    public String getDailyWorkout(){
//        return coach.getDailyWorkout();
//    }


    //QUALIFIER
    private Coach myCoach;
    private Coach anotherCoach;

    //CONSTRUCTOR INJECTION
    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach theCoach
//                          @Qualifier("cricketCoach") Coach theAnotherCoach
                          ) {
       System.out.println("In Constructor" + getClass().getSimpleName());
        myCoach = theCoach;
//      anotherCoach= theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/footballtraining")
    public String getFootballTraining(){
        return myCoach.getFootballTraining();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans coach == another, " + (myCoach == anotherCoach);
    }

//    //PRIMARY
//    private Coach myCoach;
//
//    //CONSTRUCTOR INJECTION
//    @Autowired
//    public DemoController(Coach theCoach) {
//        myCoach = theCoach;
//    }
//
//    @GetMapping("/dailyworkout")
//    public String getDailyWorkout(){
//        return myCoach.getDailyWorkout();
//    }
//
//    @GetMapping("/footballtraining")
//    public String getFootballTraining(){
//        return myCoach.getFootballTraining();
//    }
}
