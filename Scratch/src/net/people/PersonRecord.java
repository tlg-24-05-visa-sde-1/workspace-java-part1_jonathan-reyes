package net.people;

import java.time.LocalDate;
import java.time.Period;

record PersonRecord(String name, LocalDate birthDate) {
    //for free, you get the following in the PersonRecord.class file:
    //2 private fields
    //2 arg constructor
    //getters for each, with the "get"prefix" ommited, e.g. name() instead of getName()
    //toString( )
    //NOTE: you can overwrite the toString to whatever you want

    public int age (){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    /*@Override
    public String toString() {
        return String.format("Person = Name: %s, Birth Date: %s", name(), birthDate());
    }*/
}
