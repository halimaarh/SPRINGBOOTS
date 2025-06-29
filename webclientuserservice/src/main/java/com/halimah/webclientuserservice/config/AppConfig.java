package com.halimah.webclientuserservice.config;

import com.halimah.webclientuserservice.service.RestApiService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public RestApiService restApiService(){
        return new RestApiService();
    }
}
