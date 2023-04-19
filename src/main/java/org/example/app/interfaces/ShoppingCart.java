package org.example.app.interfaces;

import org.example.app.models.Product;

public interface ShoppingCart {

    public void add(Product p);

    public int quantity();

    public double total();

    public void empty();

    public void detail();

    public void pay(PaymentMethod paymentMethod);
}
