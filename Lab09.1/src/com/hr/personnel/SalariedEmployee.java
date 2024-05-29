package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    //fields
    private double salary;

    //constructors
    public SalariedEmployee() {
        super();
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);  //delegates to super constructor ( in employee class)
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);   //delegates to the constructor above ( just in case there is extra code after super)
        setSalary(salary);
    }

    //Business Methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    @Override //interface TaxPayer
    public void payTaxes() {
        //System.out.println(getName() + " paid taxes of " + (getSalary() * SALARIED_TAX_RATE));
        System.out.printf("%s paid taxes of %s \n",getName(),(getSalary()*SALARIED_TAX_RATE));
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation");
    }


    //Accessor Methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary=" + getSalary();
    }
}
