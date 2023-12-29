package org.example;

abstract class Plan{
    protected double rate;
    abstract void setRate();

    public void calculateBill(int units){
        setRate();
        System.out.println(units*rate);
    }
}
