import java.util.ArrayList;

public class Part_2nd {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        // Add Element                -     O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
