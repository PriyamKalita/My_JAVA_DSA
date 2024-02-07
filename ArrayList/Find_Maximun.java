import java.util.ArrayList;

public class Find_Maximun {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(9);
        list.add(1);
        list.add(5);

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){

            // Approach (1)
            // if (max < list.get(i)) {
            //     max = list.get(i);
            // }

            // Approach (2)
            max = Math.max(max, list.get(i));
        }
        System.out.print("Max element is : " + max);
    }
}
