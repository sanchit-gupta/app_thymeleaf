package com.mvc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class MainAppConfiguration {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(MainAppConfiguration.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        System.out.println("App is up and running now : "+new Date());
    }
}
