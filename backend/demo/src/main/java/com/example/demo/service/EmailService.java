package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.model.Vendor;

@Service
public class EmailService {

    private static final Logger logger = LoggerFactory.getLogger(EmailService.class);

    public void sendEmailToVendor(Vendor vendor) {
        String message = String.format("Sending payments to vendor %s at UPI %s", vendor.getName(), vendor.getUpi());
        // Simulate sending email by logging the message
        logger.info("Mock email to {}: {}", vendor.getEmail(), message);
        // Alternatively, you can print it to the console
        System.out.println("Mock email to " + vendor.getEmail() + ": " + message);
    }
}
