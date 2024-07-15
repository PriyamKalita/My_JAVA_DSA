import java.util.*;
public class Union_And_Intersection_Of_Two_Arrays {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> set = new HashSet<>();

        // Union
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[1]);
        }
        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[1]);
        }
        System.out.println("Union : " + set.size());

        // Intersection
        set.clear();
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[1]);
        }

        int count = 0;
        for(int i = 0; i < arr2.length; i++){
            if (set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println("Intersection : " + count);
    }
}
