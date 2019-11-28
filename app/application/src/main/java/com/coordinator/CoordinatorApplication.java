package com.coordinator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.coordinator")
public class CoordinatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoordinatorApplication.class, args);
    }

}
