package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmailLog;
import com.example.demo.service.EmailLogService;

@RestController
@RequestMapping("/api/emailLogs")
@CrossOrigin(origins = "http://localhost:5173")
public class EmailLogController {

    @Autowired
    private EmailLogService emailLogService;

    @PostMapping("/save")
    public ResponseEntity<EmailLog> saveEmailLog(@RequestBody EmailLog emailLog) {
        EmailLog savedEmailLog = emailLogService.saveEmailLog(emailLog.getEmail());
        return ResponseEntity.ok(savedEmailLog);
    }

    @GetMapping("/all")
    public ResponseEntity<List<EmailLog>> getAllEmailLogs() {
        List<EmailLog> emailLogs = emailLogService.getAllEmailLogs();
        return ResponseEntity.ok(emailLogs);
    }
}
