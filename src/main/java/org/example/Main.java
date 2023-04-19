package org.example;

import org.example.app.components.CreditCard;
import org.example.app.components.Order;
import org.example.app.components.Paypal;
import org.example.app.interfaces.PaymentMethod;
import org.example.app.models.Product;

public class Main {

    public static void main(String[] args) {

        Order order = new Order();

        Product p1  = new Product("Bread", 5.0);
        Product p2  = new Product("Mouse", 9.99);

        order.add(p1);
        order.add(p2);

        order.detail();

        PaymentMethod paypal = new Paypal();
        PaymentMethod creditCard = new CreditCard();

        order.pay(paypal);
    }
}