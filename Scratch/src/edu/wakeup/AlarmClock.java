package edu.wakeup;

/*
 *Class definition to model the workings of an alarm clock
 * This is sometimes called a "business" class, or "system" class or "application" class
 * It has NO main() method
 */
class AlarmClock {
    //class("Static") Variables
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;

    //properties or attributes - called " fields" or "instance variables"
    private int snoozeInterval = 5; //default value when client doesn't specify

    //Constructors
    public AlarmClock() {
        //no-op
    }

    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval);  //delegate to setter for validation/conversion
    }

    //functions of behaviors - called "methods" in Java
    public void snooze() {
        System.out.println(" Snoozing " + getSnoozeInterval() + " minutes");
    }

    //"accessor methods" aka getters/setters - provide controlled access to the objects state / fields

    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= 1 && snoozeInterval <= 20) {
            this.snoozeInterval = snoozeInterval;
        } else {
            System.out.println("Invalid snooze interval : " + snoozeInterval + ". Must be between " + MIN_INTERVAL +
                    " and " + MAX_INTERVAL + ".");
        }
    }

    //toString Method
    public String toString() {
        return "AlarmClock: snoozeInterval = " + getSnoozeInterval();
    }

}