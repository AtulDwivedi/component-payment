package com.routinecart.component.payment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/rest/v1/payments")
public class PaymentController {

    @Value("${payment.modes}")
    private List<String> paymentModes;

    @GetMapping("/modes")
    public String getAvailablePaymentOptions() {
        return paymentModes.get(new Random().nextInt(3 - 0 + 1) + 0);
    }
}

