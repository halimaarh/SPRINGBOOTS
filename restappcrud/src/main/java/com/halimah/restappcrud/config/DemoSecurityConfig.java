package com.halimah.restappcrud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {

    //ADDING IN-MEMORY SECURITY CONFIGURATIONS
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails john = User.builder()
                .username("john")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails mary = User.builder()
                .username("mary")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER")
                .build();

        UserDetails susan= User.builder()
                .username("susan")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        UserDetails halimah= User.builder()
                .username("halimah")
                .password("{noop}test419")
                .roles("EMPLOYEE")
                .build();

        return new InMemoryUserDetailsManager(john, mary,susan,halimah);
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(configurer -> configurer
                .requestMatchers(HttpMethod.GET, "/api/v1/students")
                .hasRole("EMPLOYEE")
                .requestMatchers(HttpMethod.POST, "/api/v1/students")
                .hasRole("MANAGER")
                .requestMatchers(HttpMethod.PUT, "/api/v1/students/**")
                .hasRole("MANAGER")
                .requestMatchers(HttpMethod.DELETE, "/api/v1/students/**")
                .hasRole("ADMIN")

        );
        //use http basic auth
        http.httpBasic(Customizer.withDefaults());

        //disable cross site forgery request(CSRF)
        http.csrf(csrf -> csrf.disable());

        return http.build();
    }
}
