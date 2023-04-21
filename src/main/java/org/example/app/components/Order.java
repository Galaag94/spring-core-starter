package org.example.app.components;

import org.example.app.interfaces.PaymentMethod;
import org.example.app.interfaces.PaymentService;
import org.example.app.interfaces.ShoppingCart;
import org.example.app.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Order implements ShoppingCart {

    private final List<Product> products;
    private final PaymentService paymentService;

    public Order(PaymentService paymentService) {
        this.products = new ArrayList<>();
        this.paymentService = paymentService;
    }

    @Override
    public void add(Product p) {
        this.products.add(p);
    }

    @Override
    public int quantity() {
       return this.products.size();
    }

    @Override
    public double total() {
        return this.products
                .stream()
                .map(Product::price)
                .reduce(0.0, Double::sum);
    }

    @Override
    public void empty() {
        this.products.clear();
    }

    @Override
    public void detail() {
        System.out.println("Item | Price");
        System.out.println("------------");
        this.products.forEach(p -> System.out.println(p.name() + " | $" + p.price()));
        System.out.println("------------");
        System.out.println("Total: $" + this.total());
    }

    @Override
    public void pay(PaymentMethod paymentMethod) {
        this.paymentService.proceedToPay(paymentMethod, this.total());
    }
}
