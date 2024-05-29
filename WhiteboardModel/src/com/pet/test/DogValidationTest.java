package com.pet.test;

import com.pet.Dog;

class DogValidationTest {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Steve");

        //Checking Breed Validation
        System.out.println(dog1); //default for breed is Mixed
        dog1.setBreed("Chihuahua");
        System.out.println(dog1);
        dog1.setBreed("Poodle");
        System.out.println(dog1);
        dog1.setBreed("Beagle");
        System.out.println(dog1);
        dog1.setBreed("Husky");   //not a valid breed
        System.out.println(dog1);
        dog1.setBreed("Rottweiler");
        System.out.println(dog1);

        Dog dog2 = new Dog("Max", "Beagle");

        //Checking age validation , range is from 0 - 35 yrs old inclusive
        System.out.println(dog2);   //default age is 0, just born
        dog2.setAge(5);
        System.out.println(dog2);
        dog2.setAge(25);
        System.out.println(dog2);
        dog2.setAge(35);            //checking upper boundary
        System.out.println(dog2);
        dog2.setAge(0);             //checking lower boundary
        System.out.println(dog2);
        dog2.setAge(-1);
        System.out.println(dog2);
        dog2.setAge(36);

    }
}
