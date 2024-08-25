package org.example;

public class User {
    private String name;
    private String lastName;
    private int age;
    private String login;
    private String password;

    public User() {}

    public void setName(String value, Validator<String> validator) {
        if (validator.validate(value)) {
            this.name = value;
        } else {
            System.out.println("Invalid name");
        }
    }

    public void setLastName(String value, Validator<String> validator) {
        if (validator.validate(value)) {
            this.lastName = value;
        } else {
            System.out.println("Invalid last name");
        }
    }

    public void setAge(int value, Validator<Integer> validator) {
        if (validator.validate(value)) {
            this.age = value;
        } else {
            System.out.println("Invalid age");
        }
    }

    public void setLogin(String value, Validator<String> validator) {
        if (validator.validate(value)) {
            this.login = value;
        } else {
            System.out.println("Invalid login");
        }
    }

    public void setPassword(String value, Validator<String> validator) {
        if (validator.validate(value)) {
            this.password = value;
        } else {
            System.out.println("Invalid password");
        }
    }

    // getters
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
