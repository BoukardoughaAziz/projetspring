package com.example.projetspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class ProjetspringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetspringApplication.class, args);
    }

}
