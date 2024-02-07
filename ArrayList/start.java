import java.util.ArrayList;
public class start{
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        // Add Element                -     O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1, 10);   //  O(1)
        System.out.println(list);

        System.out.println(list.size());

        // Get Element                -      O(1)
        int element = list.get(2);
        System.out.println(element);

        // Remove / Delete Element     -     O(n)
        list.remove(2);
        System.out.println(list);

        // Set Element at index        -     O(n)
        list.set(2, 10);
        System.out.println(list);

        // Contains Element            -     O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));


    }
}