package com.Halimah.spring_intro.spring_intro.config;

import com.Halimah.spring_intro.spring_intro.repository.Coach;
import com.Halimah.spring_intro.spring_intro.repository.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
