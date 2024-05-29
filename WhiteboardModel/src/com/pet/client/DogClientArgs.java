package com.pet.client;

import com.pet.Dog;
import com.pet.DogType;
import java.util.Arrays;

class DogClientArgs {

    public static void main(String[] args) {

        if (args.length < 5) {
            String usage =
                    "Usage: java DogClientArgs <name> <breed> <dogtype> <age> <weight>\n" +
                            "Example: java DogClientsArgs Spot Beagle NONSPORTING 5 15.5\"\n" +
                            "Note: \n" +
                            " 1. Available breeds are: " + Arrays.toString(Dog.DOG_BREEDS) + "\n" +
                            " 2. Supported dog types are: " + Arrays.toString(DogType.values()) + "\n" +
                            " 3. Age must be " + Dog.MIN_AGE + " to " + Dog.MAX_AGE + " (inclusive) \n";
            System.out.println(usage);
        }
        else {
            String nameString = args[0];
            String breedString = args[1];
            String typeString = args[2];    //needs to be of ENUM DogType
            String ageString = args[3];     //needs to be of type int
            String weightString = args[4];  //needs to be of type double

            DogType dogType = DogType.valueOf(typeString.toUpperCase());

            int age = Integer.parseInt(ageString);
            double weight = Double.parseDouble(weightString);

            Dog sampleDog = new Dog(nameString, breedString, dogType, age, weight);
            System.out.println(sampleDog);
        }

    }
}
