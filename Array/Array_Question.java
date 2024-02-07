public class Array_Question {
    public static int getLargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static void ReverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start++;
                end--;
        }
    }

    public static void pairInAnArray(int pairArray[]){
        int totalPair = 0;
        for(int i = 0; i < pairArray.length; i++){
            for(int j = i + 1; j < pairArray.length; j++){
                System.out.print(" ("+pairArray[i] + ", " + pairArray[j]+") ");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total Number of Pirs : " + totalPair);
    }

    public static void subArray(int arrt[]){
        int totalSubArray = 0;
        for(int i = 0; i < arrt.length; i++){
            for(int j = i; j < arrt.length; j++){
                for(int K = i; K <= j; K++){
                    System.out.print(arrt[K] + " ");
                    totalSubArray++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArray : " + totalSubArray);
    }

    // Approach (i) : Brute Force
    // public static void MaxSubArray(int arrttt[]){
    //     int currentSum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     for(int i = 0; i < arrttt.length; i++){
    //         for(int j = i; j < arrttt.length; j++){
    //             currentSum = 0;
    //             for(int K = i; K <= j; K++){
    //                 currentSum += arrttt[K];
    //             }
    //             System.out.println(currentSum);
    //             if(maxSum < currentSum){
    //                 maxSum = currentSum;
    //             }
    //         }
    //     }
    //     System.out.println("Max Sum : " + maxSum);
    // }

    // Approach (ii) : Prefix Sum
    // public static void MaxSubArray(int arrttt[]){
    //     int currentSum = 0;
    //     int maxSum = Integer.MIN_VALUE;

    //     int PreFix[] = new int [arrttt.length];
    //     PreFix[0] = arrttt[0];
    //     // Calculate Prefix Array
    //     for(int i = 1; i < PreFix.length; i++){
    //         PreFix[i] = PreFix[i - 1] + arrttt[i];
    //     }

    //     for(int i = 0; i < arrttt.length; i++){
    //         for(int j = i; j < arrttt.length; j++){
    //             currentSum = i == 0 ? PreFix[j] : PreFix[j] - PreFix[i - 1];
                
    //             if(maxSum < currentSum){
    //                 maxSum = currentSum;
    //             }
    //         }
    //     }
    //     System.out.println("Max Sum : " + maxSum);
    // }

    // Approach (iii) : Using Kadane's Algorithm
    public static void kadaneAlgo(int arrttt[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0; i < arrttt.length; i++){
            currentSum = currentSum + arrttt[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println("Max of SubAray Sum is : " + maxSum);
    }
    public static void main(String args[]) {

        // Largest Number in an Array
        int num[] = { 1, 2, 3, 6, 3, 5 };
        int larNum = getLargest(num);
        System.out.println("Largest Number is : " + larNum);

        // Reverse an Array
        int arr[] = { 2, 4, 6, 8 };
        ReverseArray(arr);
        for(int i  = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Pairs in an Array
        int pairArray[] = {2, 4, 6, 8, 10};
        pairInAnArray(pairArray);

        // Print SubArray
        int arrt[] = {2, 4, 6, 8, 10};
        subArray(arrt);

        // Max SubArray Sum
        int arrttt[] = {2, 4, 6, 8, 10};
        // MaxSubArray(arrttt);
        kadaneAlgo(arrttt);

    }
}
