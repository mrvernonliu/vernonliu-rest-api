package com.vernonliu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*
    Author: Vernon Liu
    Start the spring boot application
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.vernonliu"})
public class ApplicationMain {

    public static void main(String args[]) {
        SpringApplication.run(ApplicationMain.class, args);
    }

}
