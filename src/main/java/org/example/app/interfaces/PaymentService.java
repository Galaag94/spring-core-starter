package org.example.app.interfaces;

public interface PaymentService {

    public void proceedToPay(PaymentMethod provider, double total);
}
