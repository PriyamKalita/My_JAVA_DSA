public class Recursion_Question {
    // Question1:
    // For a given integer array of size N.You have to find all the
    // occurrences(indices) of a given element(Key) and print them. Use a recursive
    // function to solve this problem.
    // Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2
    // Sample Output: 1 5 7 8
    /* 
    public static void allOccurences(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        allOccurences(arr, key, i + 1);
    }
    */

    // Question 2 : You are given a number (eg - 2019), convert it into a String of
    // english like “two zero one nine”. Use a recursive function to solve this
    // problem.
    // NOTE-The digits of the number will only be in the range 0 - 9 and the
    // lastdigit of a number can’t be 0.
    // Sample Input: 1947
    // Sample Output: “one nine four seven”

    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void printDigits(int number) {
        if (number == 0) {
            return;
        }
        int lastDigit = number % 10;
        printDigits(number / 10);
        System.out.print(digits[lastDigit] + " ");
    }

    public static void main(String args[]) {
        // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        // allOccurences(arr, 2, 0);

        printDigits(1005);

    }
}
