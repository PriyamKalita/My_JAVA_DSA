public class Array_BS {
    public static int BS(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) { // Left
                start = mid + 1;
            } else { // Right
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;
        int num = BS(arr, key);
        System.out.print("Index for Key is : " + num);
    }
}
