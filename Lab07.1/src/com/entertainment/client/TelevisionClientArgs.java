package com.entertainment.client;/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import com.entertainment.DisplayType;
import com.entertainment.Television;

import java.util.Arrays;

/**
 * Intended usage (by human):
 * $ java TelevisionClientArgs <brand> <volume> <display>
 * <p>
 * Example:
 * $ java TelevisionClientArgs Samsung 32 PLASMA
 * <p>
 * GOAL:
 * Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {

            String usage =
                    "Usage: java TelevisionClientArgs <brand> <volume> <display>\n" +
                            "Example: java TelevisionClientArgs Samsung 32 PLASMA\n" +
                            "Note: \n" +
                            " 1. Available brands are" + Arrays.toString(Television.VALID_BRANDS) + "\n" +
                            " 2. Volume must be " + Television.MIN_VOLUME + " to " + Television.MAX_VOLUME + " (inclusive) \n" +
                            " 3. Supported displays are " + Arrays.toString(DisplayType.values());
            System.out.println(usage);
            return;
        }

        String brand = args[0];
        String volume = args[1];
        String displayString = args[2];

        int volumeInt = Integer.parseInt(volume);
        DisplayType displayT = DisplayType.valueOf(displayString.toUpperCase());

        Television tv1 = new Television(brand, volumeInt, displayT);

        //System.out.println("Congratulations you have entered a tv with the correct amount of arguments");
        System.out.println(tv1);

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        // System.out.println("You provided " + args.length + " arguments");
    }
}