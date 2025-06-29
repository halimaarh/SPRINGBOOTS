package com.Halimah.spring_intro.spring_intro.repository;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{
    public CricketCoach(){
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
