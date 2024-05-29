package com.pet;

import java.util.Arrays;

/**
 * The Dog class
 *
 * Properties:
 *   String name
 *   LocalDate hireDate
 *
 * Methods (excluding get/set methods):
 *   void work()        simulates work by printing a message to show it was called.
 *   String toString()  self-explanatory.
 */

public class Dog {
    //STATIC Variables
    public static final int MIN_AGE = 0;
    public static final int MAX_AGE = 35;
    public static final String[] DOG_BREEDS = {"Pomeranian", "Poodle", "Beagle", "Bulldog", "Rottweiler", "Chihuahua", "Mixed"};

    //INSTANCE VARIABLES
    private String name;
    private int age;
    private double weight;
    private String breed = "Mixed";    //default value for any breed will be mixed
    private DogType type = DogType.NONSPORTING;// They are 7 "main" categories that dogs can fall under, catch all category is "Nonsporting"
    private boolean knowsTrick;

    //Constructors
    public Dog(String name) {
        setName(name);
    }

    public Dog(String name, String breed) {
        this(name);
        setBreed(breed);
    }

    public Dog(String name, String breed, DogType type, int age, double weight) {
        this(name, breed);
        setType(type);
        setAge(age);
        setWeight(weight);
    }

    // BUSINESS METHODS
    public void bark() {
        System.out.println(getName() + " is now barking");
    }

    public void eat() {
        System.out.println(getName() + " is now eating");
    }

    //Dog needs to be taught a trick before it knows a trick
    public void taughtTrick() {
        knowsTrick = true;
    }

    public void doesTrick() {
        if (!knowsTrick) {
            System.out.println(getName() + " does not know a trick.");
        } else {
            System.out.println(getName() + " does know a trick. He performs the trick : sitting");
        }
    }

    //ACCESSOR METHODS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    //Note: Breed could have been done as an Enum but chose to do an array to get practice in validation with arrays
    public void setBreed(String breed) {
        if (!isValidBreed(breed)) {
            System.out.println("Dog breed is not valid. Valid breeds are : " + Arrays.toString(DOG_BREEDS));
        } else {
            this.breed = breed;
        }
    }

    private boolean isValidBreed(String breed) {
        for(String validBreed : DOG_BREEDS) {
            if (validBreed.equals(breed)) {
                return true;
            }
        }
        return false;
    }

    public DogType getType() {
        return type;
    }

    public void setType(DogType type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    //oldest living dog is 32, so valid range is 0(couple of months old)- 35 yrs old
    public void setAge(int age) {
        if (age < MIN_AGE || age > MAX_AGE) {
            System.out.println("Age provided is invalid: " + age +
                    ". Age must be between " + MIN_AGE + " and " + MAX_AGE + " inclusive");
        } else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        //Making sure it's a positive number
        if (weight <= 0) {
            System.out.println("Weight provided is invalid: " + weight + ". Weight must be a positive number greater than 0 ");
        } else {
            this.weight = weight;
        }
    }

    //toString()
    public String toString() {
        return "Dog [name=" + getName() + ", breed=" + getBreed() + ", Dog type=" + getType() +
                ", age=" + getAge() + ", weight=" + getWeight() + " ]";
    }
}

