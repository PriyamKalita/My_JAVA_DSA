import java.util.*;
public class Iteration_On_HashSets {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        // Approach No 1 : Using Iterators
        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Approach No 2 : 
        for(String city : cities){
            System.out.println(city);
        }
    }
}
