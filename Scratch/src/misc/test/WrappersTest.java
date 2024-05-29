package misc.test;

class WrappersTest {

    public static void main(String[] args) {
        String ageInput = "25";
        int age = Integer.parseInt(ageInput);  // takes "57" => returns int 57
        Integer ageInteger = Integer.valueOf(age); // returns an Integer object with 57 inside
        System.out.println(ageInteger);

        String populationInput = "8000000000";
        long population = Long.parseLong(populationInput); //takes "80000000000" string and gives a primitive long 8000000000
        Long populationLong = Long.valueOf(population); // takes primitive long 8000000000 and give Long object 80000000000

        String sizeInput = "9.5";
        double size = Double.parseDouble(sizeInput);
        Double sizeDouble = Double.valueOf(size);

        String isRainingInput = "true";
        boolean isRaining = Boolean.parseBoolean(isRainingInput);
        Boolean isRainingBoolean = Boolean.valueOf(isRaining);
    }
}