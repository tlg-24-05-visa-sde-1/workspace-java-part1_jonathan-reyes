package misc.test;

import java.util.Arrays;

class ArraysTest {
    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] =20;
        ages[1] =5;
        ages[2] =8;
        ages[3] =9;
        System.out.println(Arrays.toString(ages));

        //iterate using the for each loop
        for(int age: ages){
            System.out.println("the age is " + age);
        }

        double[] sizes = {1.0,2.0,3.0,4.0,5.0};
        System.out.println(Arrays.toString(sizes));

        boolean [] statuses = new boolean[4];
        System.out.println(Arrays.toString(statuses));

        String [] names = {"jay", "martinez", "bob", "emilia"};
        System.out.println(Arrays.toString(names));

        //iterate using index loop
        for (int i = 0; i < names.length; i++) {
            System.out.println("the name is " + names[i]);
        }
    }
}
