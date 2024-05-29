package misc.test;

class StringTest {
    public static void main(String[] args) {
        String city1 = "new york";
        String city2 = "new york";
        String city3 = "San Francisco";

        System.out.println(city1.equals(city2)); //RIGHT
        System.out.println(city1 == city2); //WRONG
        System.out.println();
        String newCity1 =  city1.substring(0,3); //"new"
        String newCity2 = city2.substring(0,3); //"new"
        System.out.println(newCity1.equals(newCity2)); //CORRECT way
        System.out.println(newCity1 == newCity2); //WRONG way
        System.out.println();

        String greeting = "What's up \"Doc?\"";
        System.out.println(greeting);
        System.out.println();

        String poem = """
                sugar is sweet
                and so are you""";
        System.out.println(poem);

        String pattern = "\\d{3}[A-Z]{3}|[A-Z]{1}\\d{3}[A-Z]{3}";
        String plate1 = "637YOC";
        String plate2 = "D123ERW";
        System.out.println("This license plate is valid: " + plate1.matches(pattern));
        System.out.println("This license plate is valid: " + plate2.matches(pattern));




    }
}