package com.mmv.maiorova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServingWebContentApplication {

    public static void main(String[] args) {
        System.out.println("Hallo!");

        SpringApplication.run(ServingWebContentApplication.class, args);

    }
}
