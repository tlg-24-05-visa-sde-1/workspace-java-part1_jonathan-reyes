package net.people;

import java.time.LocalDate;
import java.time.Period;

/*
 * Immutable class. Once instance is create, properties cant change . Simply no public methods available to do so
*/
class Person {
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    //this is called a derived property, it can be calculated or derived from the existing fields that we have
    public int age(){
       /*
        *Period agePeriod = Period.between(birthDate, LocalDate.now());
        *return agePeriod.getYears();
        */
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public String name() {
        return name;
    }
    public LocalDate birthDate() {
        return birthDate;
    }

    public String toString() {
        return String.format("Person = Name: %s, Birth Date: %s", name(), birthDate());
    }
}
