package com.entertainment;

import java.util.Arrays;

/*
 * Application class to model the workings of a tv set
 * no main() method here
 */
public class Television {
    //class ("static") variables - one copy, stored in the class-wide common shared area
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    //FIELDS or INSTANCE VARIABLES
    private String brand;
    private int volume;
    private DisplayType display = DisplayType.LED;
    private boolean isMuted;
    private int oldVolume;

    //constructors - these get called when the client says "new"
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    // BUSINESS METHODS
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();

        System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }

    private boolean verifyInternetConnection() {
        return true;    //fake implementation
    }

    public void mute() {
        if (!isMuted()) {
            oldVolume = getVolume();
            setVolume(0);
            isMuted = true;
        } else {
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    public boolean isMuted() {
        return isMuted;
    }

    //ACCESSOR METHODS
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

//        for (String validBrand : VALID_BRANDS) {
//            if (brand.equals(validBrand)) {
//                this.brand = validBrand;
//                correctBrand = true;
//                break;
//            }
//        }

        if (!isValidBrand(brand)) {
            System.out.printf("Invalid brand: %s. Must be one of the following: %s \n", brand, Arrays.toString(VALID_BRANDS));
            // System.out.println("INVALID Brand: "+ brand + ". Valid Brands are: Samsung, LG, Sony, Toshiba");
        } else {
            this.brand = brand;
        }
    }

    private static boolean isValidBrand(String brand) {
        for (String validBrand : VALID_BRANDS) {
            if (brand.equals(validBrand)) {
                return true;
            }
        }
        return false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
            //System.out.println("Invalid Volume:"+ volume +". Volume must be between " + MIN_VOLUME + " and " + MAX_VOLUME);
            System.out.printf("Invalid volume: %s. Must be between %s and %s. \n", volume, MIN_VOLUME, MAX_VOLUME);
        } else {
            this.volume = volume;
            isMuted = false;
//            if(isMuted()){
//                mute();
//                this.volume = volume;
//            }
//            else {
//                this.volume = volume;
//            }
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    //toString()
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());

        return String.format("Television: brand =%s, volume=  %s, display=%s ", getBrand(), getVolume(), getDisplay());

        //return "Television: brand = " + getBrand() + ' ' + ", volume = " + getVolume() + ' ' + ", display = " + getDisplay();
    }
}
