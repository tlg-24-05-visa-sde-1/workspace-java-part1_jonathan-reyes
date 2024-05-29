package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

class TelevisionClient {
    public static void main(String[] args) {

        System.out.println(Television.getInstanceCount() + " instances");

        Television tv1 = new Television("Samsung", 100);

        Television tv2 = new Television("Sony", 50);

        Television tv3 = new Television("LG", 0);
        //tv3.setBrand("Toshiba");
        //tv3.setVolume(15);

        Television tv4 = new Television("Sony", 101, DisplayType.OLED);
        //call some business methods
        tv1.turnOn();
        tv1.turnOff();
        tv2.turnOn();
        tv2.turnOff();
        tv3.turnOn();
        tv3.turnOff();

        System.out.println(tv1);
        System.out.println(tv2.toString());
        System.out.println(tv3);
        System.out.println(tv4);
        System.out.println(Television.getInstanceCount() + " instances");
    }
}
