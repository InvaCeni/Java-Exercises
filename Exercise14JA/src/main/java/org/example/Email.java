package org.example;

public class Email {
    public String formatEmail(String email) {
        if (email == null || email.isEmpty()) {
            return "unknown";
        }
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (!email.matches(emailRegex)) {
            return "unknown";
        }
        return email;
    }
}