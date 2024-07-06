package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmailLog;
import com.example.demo.repository.EmailLogRepository;

@Service
public class EmailLogService {

    @Autowired
    private EmailLogRepository emailLogRepository;

    public EmailLog saveEmailLog(String email) {
        EmailLog emailLog = new EmailLog(email);
        return emailLogRepository.save(emailLog);
    }

    public List<EmailLog> getAllEmailLogs() {
        return emailLogRepository.findAll();
    }
}
