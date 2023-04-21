package org.example.app.config;

import org.example.Cat;
import org.example.app.components.CreditCard;
import org.example.app.components.Order;
import org.example.app.components.PaymentServiceImpl;
import org.example.app.components.Paypal;
import org.example.app.interfaces.PaymentMethod;
import org.example.app.interfaces.PaymentService;
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

    /*@Bean
    Order order() {
        return new Order(paymentService());
    }

    @Bean
    PaymentService paymentService() {
        return new PaymentServiceImpl();
    }

    @Bean
    PaymentMethod paypal() {
        return new Paypal();
    }

    @Bean
    PaymentMethod creditCard() {
        return new CreditCard();
    }*/
}
