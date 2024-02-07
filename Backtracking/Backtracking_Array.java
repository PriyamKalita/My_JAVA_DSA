public class Backtracking_Array {
    public static void ChangeArray(int arr[], int i, int value){
        if(i == arr.length){
            PrintArray(arr);
            return;
        }
        arr[i] = value;
        ChangeArray(arr, i + 1, value + 1);
        arr[i] = arr[i] - 2;   // Backtracking Step
    }
    public static void PrintArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        ChangeArray(arr, 0, 1);
        PrintArray(arr);
    }
}