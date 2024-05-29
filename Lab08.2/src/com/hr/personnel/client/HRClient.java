/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24),50000.00));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 20,40));
        dept.addEmployee(new SalariedEmployee("James", LocalDate.of(1970, 6, 25), 65000.00));
        dept.addEmployee(new HourlyEmployee("Jessica", LocalDate.of(1960, 3, 10), 29.00,35.00));

        dept.addEmployee(new Executive("Joy", LocalDate.of(1975, 7, 10), 100000.00));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        System.out.println("\nPay employees:");
        dept.payEmployees();

        System.out.println("\nHoliday Break");
        dept.holidayBreak();
    }
}