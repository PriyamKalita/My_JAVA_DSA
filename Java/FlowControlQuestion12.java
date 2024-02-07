import java.util.Scanner;

public class FlowControlQuestion12 {
    public static void main(String args[]) {
        // Question No. (33) : Print Number from 1 to 10
        /*
         * int counter = 1;
         * while(counter <= 10){
         * System.out.println(counter);
         * counter++;
         * }
         */

        // Question No. (34) : Print Sum of First n Natural Numbers
        /*
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * int sum = 0;
         * int i = 1;
         * 
         * while(i <= n){
         * sum = sum + i;
         * i++;
         * }
         * System.out.println(sum);
         */

        // Question No. (35) : Square Pattern
        // * * * *
        // * * * *
        // * * * *
        // * * * *
        /*
         * System.out.println("Using For Loop");
         * for(int line = 1; line <= 4; line++){
         * System.out.println("* * * *");
         * }
         * System.out.println("Using While Loop");
         * int line = 1;
         * while(line <= 4){
         * System.out.println("* * * *");
         * line++;
         * }
         */

        // Question No. (36) : Print Reverse of A Number
        /*
         * int n = 10899;
         * 
         * while(n > 0){
         * int lastDisgit = n % 10;
         * System.out.print(lastDisgit);
         * n = n / 10;
         * }
         * System.out.println();
         */

        // Question No. (37) : Reverse th given Number
        /*
         * int n = 10899;
         * int rev = 0;
         * 
         * while(n > 0){
         * int lastDigit = n % 10;
         * rev = (rev * 10) + lastDigit;
         * n = n / 10;
         * }
         * System.out.println(rev);
         */

        // Question No. (38) : Keep Entering Numbers till user enters a multiple of 10
        // 1st Approach
        /*
         * Scanner sc = new Scanner(System.in);
         * // do{
         * // System.out.println("Enter Your Number : ");
         * // int n = sc.nextInt();
         * // if((n % 10) == 0){
         * // break;
         * // }
         * // System.out.println(n);
         * // }while(true);
         */

        // 2nd Approach
        /*
         * while(true){
         * int n = sc.nextInt();
         * if((n % 10) == 0){
         * break;
         * }
         * System.out.println(n);
         * }
         */

        // Question No. (39) : Display all Numbers entered by user except multiple of 10
        // 1st Approach
        /*
         * Scanner sc = new Scanner(System.in);
         * while(true){
         * int n = sc.nextInt();
         * if((n % 10) == 0){
         * continue;
         * }
         * System.out.println(n);
         * }
         */

        // 2nd Approach
        /*
         * Scanner sc = new Scanner(System.in);
         * do{
         * System.out.println("Enter Your Number : ");
         * int n = sc.nextInt();
         * if((n % 10) == 0){
         * continue;
         * }
         * System.out.println(n);
         * }while(true);
         */

        // Question No. (40) : Check if a number is prime or Not
        // 1st Approach
        /*
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * 
         * if (n == 2) {
         * System.out.println("N is Prime");
         * } else {
         * boolean isPrime = true;
         * for (int i = 2; i <= n - 1; i++) {
         * if ((n % i) == 0) {
         * isPrime = false;
         * }
         * }
         * if (isPrime == true) {
         * System.out.println("N is Prime");
         * } else {
         * System.out.println("N is not Prime");
         * }
         */

        /*
         * // 2nd Approach
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * 
         * if (n == 2) {
         * System.out.println("N is Prime");
         * } else {
         * boolean isPrime = true;
         * for (int i = 2; i <= Math.sqrt(n); i++) {
         * if ((n % i) == 0) {
         * isPrime = false;
         * }
         * }
         * if (isPrime == true) {
         * System.out.println("N is Prime");
         * } else {
         * System.out.println("N is not Prime");
         * }
         * }
         */

        // Question No. (41):How many times 'Hello' is printed?
        // for (int i = 0; i < 5; i++) {
        // System.out.println("Hello");
        // i += 2;
        // }

        // Question No. (42) : Write a program that reads a set of integers, and then prints the sum of the even and odd integers
        // 1st Approach
        /* 
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.print("Enter the number ");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.print("Do you want to continue? Press1 for yes or 0f or no");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
*/

/* 
        // 2nd Approach
        Scanner scanner = new Scanner(System.in);

        // Create two variables to store the sum of even and odd integers.
        int evenSum = 0;
        int oddSum = 0;

        // Read a set of integers from the user.
        System.out.println("Enter a set of integers (press Enter to finish): ");
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }

            // Check if the number is even or odd.
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        // Print the sum of even and odd integers.
        System.out.println("The sum of even integers is: " + evenSum);
        System.out.println("The sum of odd integers is: " + oddSum);
        */

        // Question No. (43) : Write a program to find the factorialof any number entered by the user.
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int fact = 1;
        // if(n == 0){
        //     System.out.println(fact);
        // }else{
        //     for(int i = 1; i <= n; i++){
        //         fact = fact * i;
        //     }
        //     System.out.println(fact);
        // }

        
        // Question No. (44) : Write a program to print the multiplication table of a number N, entered by the user.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(n + " x " + i +  " = " + n * i);
        }
    }
}
