package com.rusinek.testingapp;

public interface Expression {

    Money reduce(Bank bank, String to);
}
