import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
public class Inbuilt_Sort {
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printArr3(Integer arr[]){
        for(Integer i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {1, 4, 3, 6, 2};
        // Arrays.sort(arr);

        // Array is only Sorted From Index 0 to 2
        Arrays.sort(arr, 0, 3);
        printArr(arr);

        Integer arr3[] = {5, 4, 1, 3, 2};
        // Arrays.sort(arr3, Collections.reverseOrder());
        Arrays.sort(arr3, 0, 3, Collections.reverseOrder());
        printArr3(arr3);
    }
}
