package com.Halimah.spring_intro.spring_intro.repository;

public class SwimCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Swimming like Aquaman";
    }

    @Override
    public String getFootballTraining() {
        return "";
    }
}
