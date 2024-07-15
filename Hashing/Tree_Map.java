import java.util.*;
public class Tree_Map {
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

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 120);
        tm.put("China", 150);
        tm.put("US", 50);

        System.out.println(tm);
    }
}
