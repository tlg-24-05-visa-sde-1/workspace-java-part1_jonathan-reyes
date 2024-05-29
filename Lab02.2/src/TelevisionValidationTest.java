class TelevisionValidationTest {

    public static void main(String[] args) {
        Television tv = new Television("Sony");
        tv.setVolume(0);
        System.out.println(tv);
        tv.setVolume(100);
        System.out.println(tv);
        tv.setVolume(-1);
        tv.setVolume(101);
        System.out.println(tv);

        System.out.println(" ");

        Television tv2 = new Television("Samsung");
        System.out.println(tv2);

        tv2.setBrand("LG");
        System.out.println(tv2);

        tv2.setBrand("Sony");
        System.out.println(tv2);

        tv2.setBrand("Toshiba");
        System.out.println(tv2);

        tv2.setBrand("INVALID");
        System.out.println(tv2);

    }
}