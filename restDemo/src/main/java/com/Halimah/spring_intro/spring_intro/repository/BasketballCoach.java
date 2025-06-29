package com.Halimah.spring_intro.spring_intro.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BasketballCoach implements Coach{
    public BasketballCoach() {
        System.out.println("In Constructor" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Kobe Bryant is better than Lebron James";
    }

    @Override
    public String getFootballTraining() {
        return "";
    }
}
