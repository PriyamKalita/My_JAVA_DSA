import java.util.Scanner;

public class FunctionMethodQuestion18 {
    public static int avgThree(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    public static boolean iseven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindrome(int n) {
        int palindrome = n;// copied number intovariable
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (n == reverse) {
            return true;
        }
        return false;

    }

    public static int sumDigit(int n){
        int sumDigit = 0;

        while(n > 0) {
            int lastDigit = n % 10;
            sumDigit += lastDigit;
            n /= 10;
        }
        return sumDigit;
    }

    public static void main(String args[]) {
        // Question No. (45) : Write a Java method to compute the average of three
        // numbers.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = avgThree(a, b, c);
        System.out.println(avg);

        // Question No. (46) : Write a method name disEven that accepts an int
        // argument.The method should return true if the argument iseven,or false
        // otherwise.Also write a program to test your method.
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        if (iseven(num)) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

        // Question No. (47) :
        // Write a Java program to check if a number is a palindrome in Java?(121 is
        // apalindrome, 321 is not)
        // A number is called a palindrome if the number is equal to the reverse of a
        // numbere.g.,121 is a palindrome because the reverse of 121 is 121 itself.On
        // the otherhand, 321 is not a palindrome
        // because the reverse of 321 is 123, which is not equal to 321.

        System.out.println("Enter a number :");
        Scanner scnnn = new Scanner(System.in);
        int palindrome = scnnn.nextInt();

        if (isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a palindrome");
        } else {
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }

        // Question No. (48) : Write a Java method to compute the sum of the digits in
        // an integer.
        Scanner scnnnn = new Scanner(System.in);
        int num3 = scnnnn.nextInt();
        System.out.println(sumDigit(num3));
    }

}
