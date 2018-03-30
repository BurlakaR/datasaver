package com.datasaver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.datasaver")
public class Starter {
    public static void main(String[] args) {
        SpringApplication.run(Starter.class, args);}
}
