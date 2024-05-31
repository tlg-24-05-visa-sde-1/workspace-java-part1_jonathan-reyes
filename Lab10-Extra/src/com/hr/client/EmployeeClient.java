package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;
import com.transportation.DestinationUnreachableException;

public class EmployeeClient {

    public static void main(String[] args) {
        // create an instance of Employee
        Employee emp1 = new Employee("John");

        //call goToWork() on the Employee object
        //NOTE:if you get the exception thrown up here you need to do the try catch here uotherwise you need to say main
        //is throwing an exception which is bad coding as it goes to JVM
        try {
            emp1.goToWork();
        }
        /*catch (DestinationUnreachableException e) {
            System.out.println(e.getMessage());;
        }*/
        catch(WorkException e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.getCause()); // will show the underlying message that was wrapped by the work exception
            System.out.println();
            e.printStackTrace();
        }


    }
}