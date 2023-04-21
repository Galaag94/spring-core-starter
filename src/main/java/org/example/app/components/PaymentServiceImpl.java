package org.example.app.components;

import org.example.app.interfaces.PaymentMethod;
import org.example.app.interfaces.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void proceedToPay(PaymentMethod provider, double total) {
        provider.executePayment(total);
    }
}
