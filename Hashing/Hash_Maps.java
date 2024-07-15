import java.util.*;
public class Hash_Maps{
    public static void main(String[] args) {
        // Create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert   - O(1)
        hm.put("India", 120);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // Get - O(1)
        int populationOfIndia = hm.get("India");
        System.out.println(populationOfIndia);

        System.out.println(hm.get("Nepal"));

        // Containskey - o(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Nepal"));

        // Remove - O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // Size
        System.out.println(hm.size());

        // clear
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}