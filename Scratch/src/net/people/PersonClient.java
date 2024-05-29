package net.people;

import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {

        //using person class
        Person p1 = new Person("Bob", LocalDate.of(1990, 1, 1 ));
        System.out.printf("%s is %s years old \n",p1.name(),p1.age() );
        System.out.println(p1);


        //using PersonRecord class
        PersonRecord p2 = new PersonRecord("Erik", LocalDate.of(1995, 4, 10 ));
        System.out.printf("%s is %s years old \n",p2.name(),p2.age() );
        System.out.println(p2);
    }
}
