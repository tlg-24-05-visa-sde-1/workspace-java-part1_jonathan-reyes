package com.pet.client;

import com.pet.Dog;
import com.pet.DogType;

class DogClient {
    public static void main(String[] args) {

        //create dog objects
        Dog dog1 = new Dog("Max", "Bulldog", DogType.NONSPORTING, 5, 2.5);
        Dog dog2 = new Dog("Spot", "Chihuahua", DogType.TOY, 2, 5.0);
        Dog dog3 = new Dog("Toaster", "Mixed");
        Dog dog4 = new Dog("Sam", "Beagle");

        //accessing getters/setters
        dog3.setType(DogType.SPORTING);
        dog3.setAge(4);
        dog4.setType(DogType.HOUND);
        dog4.setWeight(3.0);

        //call some business methods
        dog2.bark();
        dog1.eat();
        dog3.bark();
        dog1.taughtTrick();     //dog must be taught trick first before he knows and can do a trick
        dog1.doesTrick();
        dog3.doesTrick();       //dog has not been taught trick first so cant do a trick

        //call to string
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
    }
}