public class Merge_____Sort {
    public static void PrintArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // left Part
        mergeSort(arr, mid + 1, ei);   // Right Part
        merge(arr, si, mid , ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        // Why we write [ei - si + 1] because 
        // for exapmle
        // left Part (0, 3) 4 element
        // Right Part (4, 6) 3 element
        // Total element in An Array id 7
        int temp[] = new int[ei - si + 1];
        int i = si; // Iterator for Left Part
        int j = mid + 1; // Iterator for Right Part
        int k = 0;

        while (i <= mid && j <= ei) {
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Left Part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // Right Part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp o Original Array
        for(k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }

    }
    public static void main(String[] args) {
        int arr[] = {3, 7, 5, 9, 2, 5};
        mergeSort(arr, 0, arr.length - 1);
        PrintArr(arr);
    }
}
