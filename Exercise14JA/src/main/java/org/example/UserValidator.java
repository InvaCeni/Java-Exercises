package org.example;

public class UserValidator {

    public void validateEmails(String email, String alternativeEmail) {
        Email emailObj = new Email();
        email = emailObj.formatEmail(email);
        alternativeEmail = emailObj.formatEmail(alternativeEmail);

        System.out.println("Validated Email: " + email);
        System.out.println("Validated Alternative Email: " + alternativeEmail);
    }
}