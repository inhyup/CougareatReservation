package com.example.hyup3.cougareatreservation.Model;

/**
 * Created by hyup3 on 10/11/2017.
 */

public class Money {

    public Money() {
    }

    static double money;
    static double total = 0;

    public Money(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double addMoney(double price)
    {
        total += price;
        return total;
    }


    @Override
    public String toString() {
        return "$ " + money;
    }
}
