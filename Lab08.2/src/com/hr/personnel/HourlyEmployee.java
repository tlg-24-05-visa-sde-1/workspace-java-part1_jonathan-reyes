package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    //Fields
    private double rate;
    private double hours;

    //Constructors
    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate); //delegates to super constructor ( in employee class)
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate); //delegates to the constructor above ( just in case there is extra code after super)
        setRate(rate);
        setHours(hours);
    }

    //Business or action-oriented methods
    @Override
    public void pay(){
        System.out.println(getName() + " is paid hourly " + (getRate()*getHours()));
    }

    //Accessor Methods
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }


    @Override
    public String toString() {
        return super.toString() + ", rate=" + getRate() + ", hours=" + getHours();
    }
}
