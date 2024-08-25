package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new User();

        // name validation
        Validator<String> nameValidator = new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input != null && !input.isEmpty() && Character.isUpperCase(input.charAt(0));
            }
        };
        user.setName("John", nameValidator);

        // last name validation
        Validator<String> lastNameValidator = new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input != null && !input.isEmpty() && Character.isUpperCase(input.charAt(0));
            }
        };
        user.setLastName("Doe", lastNameValidator);

        // age validation
        Validator<Integer> ageValidator = new Validator<Integer>() {
            @Override
            public boolean validate(Integer input) {
                return input >= 0 && input <= 150;
            }
        };
        user.setAge(25, ageValidator);

        // login validation
        Validator<String> loginValidator = new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input != null && input.length() == 10;
            }
        };
        user.setLogin("abcdefghij", loginValidator);

        // password validation
        Validator<String> passwordValidator = new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input != null && input.contains("!");
            }
        };
        user.setPassword("password!", passwordValidator);

        System.out.println("User details:");
        System.out.println("Name: " + user.getName());
        System.out.println("Last name: " + user.getLastName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Login: " + user.getLogin());
        System.out.println("Password: " + user.getPassword());
    }
}