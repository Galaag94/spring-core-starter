package org.example.app.components;

import org.example.app.interfaces.PaymentMethod;
import org.springframework.stereotype.Component;

@Component
public class Paypal implements PaymentMethod {
    @Override
    public void executePayment(double total) {
        System.out.println("Proceeding to pay $" + total + " dollars [Paypal]");
    }
}
