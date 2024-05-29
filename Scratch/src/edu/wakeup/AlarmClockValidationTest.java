package edu.wakeup;/*
 *Main-class focused on testing setter validation logic
 *
 * DO thorough BVT(Boundary  Value Testing) on the setter methods of AlarmClock
 * that is we check the values on the edges of the valid range, and just outside it
 * 0,1 and 20,21
 */

class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1);     //should "stick"
        System.out.println(clock);
        clock.setSnoozeInterval(0);
        System.out.println(clock.getSnoozeInterval());
        clock.setSnoozeInterval(20);
        System.out.println(clock.getSnoozeInterval());
        clock.setSnoozeInterval(21);
        System.out.println(clock.getSnoozeInterval());

    }
}