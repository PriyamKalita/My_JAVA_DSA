import java.util.Scanner;

public class ARRAYS_Assignment {
    public static boolean atLeastTwice(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        // Question 1: Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(atLeastTwice(arr));
    }
}
