package com.rusinek.testingapp;

/**
 * Created by Adrian Rusinek on 29.06.2019
 **/
public class Bank {

    Money reduce(Expression source, String toCurrency) {
        return source.reduce(toCurrency);
    }
}
