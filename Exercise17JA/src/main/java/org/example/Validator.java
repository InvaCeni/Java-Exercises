package org.example;

interface Validator<T> {
    boolean validate(T input);
}