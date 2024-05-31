package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private final String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
    /*
     *      Option4: try-catch and throw a different exception
     *      Note: we will "wrap" the DestinationUnreachableException into a new WorkException
     *
     */
    public void goToWork() throws WorkException {
        // create an instance of Car with all three properties: vin, make, model
        Car c = new Car("ABC123", "Toyota", "Matrix");

        //call moveTo() on the Car object, passing "West Seattle" for the destination
        try {
            c.start();
            c.moveTo("West Seattle");
            //c.stop();  dont put here because if the exception is thrown this part is never actually done
        }
        catch (DestinationUnreachableException e) {
            //insert this exception into a new WorkException and throw that
            throw new WorkException("Unable to get to work", e);    //e is the 'cause' of the work exception
        }
        finally {
            c.stop();
        }
    }



    /*
     *      Option3: try-catch, 'react in some way" and then rethrow it back at the client
     *
     */
   /* public void goToWork() throws DestinationUnreachableException {
        // create an instance of Car with all three properties: vin, make, model
        Car c = new Car("ABC123", "Toyota", "Matrix");

        //call moveTo() on the Car object, passing "West Seattle" for the destination
        try {
            c.start();
            c.moveTo("West Seattle");
            //c.stop();  dont put here because if the exception is thrown this part is never actually done
        } catch (DestinationUnreachableException e) {
            System.out.println( "blah blah via Java Mail API to complain");
            throw e;
        } finally {
            c.stop();
        }
    }*/

    /*
     *      Option 2:    "punt" i.e. DONT catch the exception at all, just "ignore" it
     *      NOTE: we uses a try-finally, to guarantte that c.stop() is always called, BUT we're still punting becausse there's no catch
     */

    /*
        public void goToWork() throws DestinationUnreachableException {
            // create an instance of Car with all three properties: vin, make, model
            Car c = new Car("ABC123", "Toyota", "Matrix");

            try {
                c.start();
                c.moveTo("West Seattle");
            } finally {
                c.stop();
            }

        }
    */

    /*
     *     Option 1 : tr-catch and handle it in some way so the exception stays here
     *     NOte: the c.stop call is done in the finally block because finally awlays executes regardless of exceptin or not
     */

    /*
        public void goToWork() {
        // create an instance of Car with all three properties: vin, make, model
        Car c = new Car("ABC123", "Toyota", "Matrix");

        //call moveTo() on the Car object, passing "West Seattle" for the destination
        try {
            c.start();
            c.moveTo("West Seattle");
            //c.stop();  dont put here because if the exception is thrown this part is never actually done
        }
        catch(DestinationUnreachableException e){
            System.out.println(e.getMessage()); //just the reason string for the exception
        }
        finally{
            c.stop();
        }
    }*/

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}