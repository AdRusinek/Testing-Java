package com.rusinek.testingapp;

/**
 * Created by Adrian Rusinek on 29.06.2019
 **/
public class Sum implements Expression{

    Money augmend;
    Money addmend;

    public Sum(Money augmend, Money addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    public Money reduce(String to){
        int amount = augmend.amount + addmend.amount;
        return new Money(amount, to);
    }
}
