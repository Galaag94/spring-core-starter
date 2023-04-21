package org.example;

import org.example.app.components.CreditCard;
import org.example.app.components.Order;
import org.example.app.components.Paypal;
import org.example.app.config.ProjectConfig;
import org.example.app.interfaces.PaymentMethod;
import org.example.app.models.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

       /* Order order = new Order();

        Product p1  = new Product("Bread", 5.0);
        Product p2  = new Product("Mouse", 9.99);

        order.add(p1);
        order.add(p2);

        order.detail();

        PaymentMethod paypal = new Paypal();
        PaymentMethod creditCard = new CreditCard();

        order.pay(paypal);*/

        // getting bean by type
        //var cat = context.getBean(Cat.class);

        // getting by name
        //var cat = context.getBean("tom");

       /* context.registerBean("DonGato", Cat.class, () -> {
            var cat = new Cat();
            cat.setName("DonGato");
            return cat;
        }, bd -> bd.setPrimary(true));

        var cat = context.getBean(Cat.class);*/

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var order = context.getBean(Order.class);

        Product p1  = new Product("Bread", 5.0);
        Product p2  = new Product("Mouse", 9.99);

        order.add(p1);
        order.add(p2);

        order.detail();

        var paypal = context.getBean("paypal", PaymentMethod.class);
        var creditCard = context.getBean("creditCard", PaymentMethod.class);

        order.pay(paypal);
    }
}