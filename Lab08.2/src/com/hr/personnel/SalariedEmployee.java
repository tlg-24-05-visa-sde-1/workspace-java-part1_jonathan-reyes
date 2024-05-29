package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    //fields
    private double salary;

    //constructors
    public SalariedEmployee() {
        super();
    }
    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);  //delegates to super construtor ( in employee class)
    }
    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);   //delegates to the constructor above ( just in case there is extra code after super)
        setSalary(salary);
    }

    //Business Methods
    @Override
    public void pay(){
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    public void takeVacation(){
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
