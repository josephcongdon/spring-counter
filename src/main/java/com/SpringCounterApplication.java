package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan(basePackages = {"java" , "com"})
public class SpringCounterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCounterApplication.class, args);
    }

}
