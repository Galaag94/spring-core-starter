package org.example.app.config;

import org.example.Cat;
import org.example.app.interfaces.PaymentMethod;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    /*@Bean()
    Cat tom() {
        return new Cat("Tom");
    }

    @Bean
    Cat benito() {
        return new Cat("Benito");
    }*/
}
