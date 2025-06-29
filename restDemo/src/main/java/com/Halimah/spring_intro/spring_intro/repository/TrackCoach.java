package com.Halimah.spring_intro.spring_intro.repository;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements Coach{
    public TrackCoach() {
        System.out.println("In Constructor" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "I'm running like Usain Bolt";
    }

    @Override
    public String getFootballTraining() {
        return "";
    }
}
