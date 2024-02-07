import java.util.ArrayList;
public class Swap_Two_Number {
    public static void swap(ArrayList <Integer> list, int idx1, int idx3){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx3));
        list.set(idx3, temp);
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(9);
        list.add(1);
        list.add(5);

        int idx1 = 1, idx3 = 3;
        System.out.println(list);
        swap(list, idx1, idx3);
        System.out.println(list);

    }
}
