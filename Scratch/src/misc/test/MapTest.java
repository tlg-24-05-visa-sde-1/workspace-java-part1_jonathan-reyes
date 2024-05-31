package misc.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class MapTest {

    public static void main(String[] args) {
        Map<String,Double> gpaMap = new HashMap<>();

        gpaMap.put("Breana",3.6);
        gpaMap.put("Greece",3.8);
        gpaMap.put("Steve",2.0);
        gpaMap.put("Ella", 1.5);
        gpaMap.put("Jack",2.5);

        dump(gpaMap);
        System.out.println();

        System.out.println("breana's gpa is: " + gpaMap.get("Breana"));
        System.out.println();

        //print the names of those with gpa>2.0
        for (var entry: gpaMap.entrySet()){
            if(entry.getValue() > 2.0){
                System.out.println(entry.getKey());
            }
        }


        //print all gpas that are 3.5 or greater

        /*Collection<Double>  gpaValues = gpaMap.values();
        for (Double gpa : gpaValues) {
            if (gpa > 3.5) {
                System.out.println(gpa);
            }
        }
*/
        //gpaValues.forEach(System.out::println);  //prints everything in gpaValues


    }

    private static void dump(Map<String,Double> map) {
        for(Map.Entry<String,Double> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //NOTE: Map.Entry<String,Double> can just be replaced with var
    }
}