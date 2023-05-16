package com.portfolioAP.dmnc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan("com.portfolioAP.dmnc.model")
@ComponentScan("com.portfolioAP.dmnc.service")
@SpringBootApplication
@EnableJpaRepositories("com.portfolioAP.dmnc.repository")
public class DmncApplication {
    public static void main(String[] args) {
        SpringApplication.run(DmncApplication.class, args);
    }
}