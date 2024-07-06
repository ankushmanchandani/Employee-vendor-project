package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Vendor;
import com.example.demo.service.VendorService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class EmailController {

    @Autowired
    private VendorService vendorService;

    @GetMapping("/vendor/{email}")
    public ResponseEntity<Vendor> getVendorByEmail(@PathVariable String email) {
        return vendorService.getVendorByEmail(email)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/sendVendorEmail")
    public String sendVendorEmail(@RequestParam String name, @RequestParam String upi, @RequestParam String email) {
        // Mock email sending logic
        return "Mock email sent to " + email + ": Sending payments to vendor " + name + " at UPI " + upi;
    }
}
