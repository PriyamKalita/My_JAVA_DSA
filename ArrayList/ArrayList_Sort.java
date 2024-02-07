import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_Sort {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(9);
        list.add(1);
        list.add(5);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());     
        // Collections.reverseOrder() is a Comparator(Comparator is a function in Java which help to determine the logic)
        System.out.println(list);
    }
}
