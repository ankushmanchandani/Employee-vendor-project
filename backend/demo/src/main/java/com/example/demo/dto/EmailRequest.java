package com.example.demo.dto;



import java.util.List;

public class EmailRequest {
    private String subject;
    private String message;
    private List<String> recipientEmails;

    public EmailRequest() {
    }

    public EmailRequest(String subject, String message, List<String> recipientEmails) {
        this.subject = subject;
        this.message = message;
        this.recipientEmails = recipientEmails;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getRecipientEmails() {
        return recipientEmails;
    }

    public void setRecipientEmails(List<String> recipientEmails) {
        this.recipientEmails = recipientEmails;
    }
}
