package com.notifyhub.notifyhub;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NotifyhubApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotifyhubApplication.class, args);
    }
    @Bean
    CommandLineRunner printBeans(ApplicationContext ctx) {
        return args -> {
            System.out.println("Total beans: " + ctx.getBeanDefinitionCount());
            System.out.println("Has PingService? " + ctx.containsBean("pingService"));
        };
    }
}
