package com.smartagro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SmartAgroApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmartAgroApplication.class, args);
    }
}
