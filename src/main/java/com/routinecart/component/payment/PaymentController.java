package com.routinecart.component.payment;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/rest/v1/payments")
@ConfigurationProperties(prefix = "payment")
public class PaymentController {

//    @Value("${payment.modes}")
    private List<String> modes;

    @GetMapping("/modes")
    public String getAvailablePaymentOptions() {
        return modes.get(new Random().nextInt(3 - 0 + 1) + 0);
    }

    public void setModes(List<String> modes) {
        this.modes = modes;
    }

    public List<String> getModes() {
        return modes;
    }
}

