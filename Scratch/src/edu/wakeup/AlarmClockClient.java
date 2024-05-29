package edu.wakeup;

/*
 * Client-side " main-class" ( class definition with the main() method)
 * It will create a few instances of AlarmClock
 */
class AlarmClockClient {
    public static void main(String[] args) {

        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);

        AlarmClock clock2 = new AlarmClock(AlarmClock.MAX_INTERVAL);

        AlarmClock clock3 = new AlarmClock();

        //make them snooze
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();

        //toString methods
        System.out.println(clock1.toString());
        System.out.println(clock2); // toString() automatically called
        System.out.println(clock3);
    }
}
