package com.example.demospringbootlogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class DemoSpringbootLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringbootLoginApplication.class, args);
    }

}
