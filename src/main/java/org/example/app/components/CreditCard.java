package org.example.app.components;

import org.example.app.interfaces.PaymentMethod;

public class CreditCard implements PaymentMethod {
    @Override
    public void executePayment(double total) {
        System.out.println("Proceeding to pay $" + total + " dollars [Credit card]");
    }
}
