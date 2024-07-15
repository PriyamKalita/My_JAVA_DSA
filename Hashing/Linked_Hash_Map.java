import java.util.*;
public class Linked_Hash_Map {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 120);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 120);
        lhm.put("China", 150);
        lhm.put("US", 50);

        System.out.println(lhm);
    }
}
