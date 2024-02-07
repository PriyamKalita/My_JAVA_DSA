public class Counting_Sort {
    public static void CountingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
    
        int count[] = new int[largest + 1]; 
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        } 
        // Sorting
        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        CountingSort(arr);
        printArr(arr);
    }
}
/*
Input array:

arr = [1, 4, 1, 3, 2, 4, 3, 7]
Step 1: Find the largest element in the array

largest = 7
Step 2: Create a count array and initialize it to 0

count = [0, 0, 0, 0, 0, 0, 0, 0]
Step 3: Iterate over the input array and increment the corresponding count in the count array

count[1]++; // 2
count[4]++; // 2
count[3]++; // 2
count[7]++; // 1
Step 4: Iterate over the count array and copy the elements to the input array in sorted order

i = 1
count[i] = 2 > 0
    arr[j] = i = 1
    j = 1
    count[i]--;
i = 2
count[i] = 2 > 0
    arr[j] = i = 2
    j = 2
    count[i]--;
i = 3
count[i] = 2 > 0
    arr[j] = i = 3
    j = 3
    count[i]--;
i = 4
count[i] = 0 <= 0
i = 5
count[i] = 2 > 0
    arr[j] = i = 4
    j = 4
    count[i]--;
i = 6
count[i] = 2 > 0
    arr[j] = i = 3
    j = 5
    count[i]--;
i = 7
count[i] = 1 > 0
    arr[j] = i = 7
    j = 6
    count[i]--;
Output array:

arr = [1, 1, 2, 2, 3, 3, 4, 4, 7] 
*/