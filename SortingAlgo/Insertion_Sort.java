public class Insertion_Sort {
    public static void InsertionSort3(int arr[]){
        // for(int i = 1; i < arr.length; i++){
        //     int curr = arr[i];
        //     int prev = i - 1;
        //     // Finding out the correct position to insert
        //     while(prev >= 0 && arr[prev] > curr){
        //         arr[prev + 1] = arr[prev];
        //         prev--;
        //     } 
        //     // Insertion
        //     arr[prev + 1] = curr;
        // }

        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    } 
    public static void main(String args[]){
        int arr[] = {6, 7, 3, 5, 9};
        InsertionSort3(arr);
        printArr(arr);
    }
}
