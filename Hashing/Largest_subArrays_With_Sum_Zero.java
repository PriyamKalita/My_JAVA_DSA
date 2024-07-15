import java.util.*;
public class Largest_subArrays_With_Sum_Zero {
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum =0;
        int length = 0;

        for(int j = 0; j < arr.length; j++){
            sum += arr[j];
            if(map.containsKey(sum)){
                length = Math.max(length, j - map.get(sum));
            }else{
                map.put(sum, j);
            }
        }
        System.out.println("Largest subArray with sum as 0 : " + length );
    }
}
