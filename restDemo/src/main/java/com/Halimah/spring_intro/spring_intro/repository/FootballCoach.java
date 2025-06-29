package com.Halimah.spring_intro.spring_intro.repository;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    public FootballCoach() {
        System.out.println("In Constructor" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Fast Bowling for 15mins";
    }


    @Override
    public String getFootballTraining() {
        return "Manchester Club get ready to lose this weekend";
    }
}
