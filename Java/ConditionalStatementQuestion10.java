import java.util.Scanner;

public class ConditionalStatementQuestion10 {
    public static void main(String args[]) {
        // Question No. (22): Print largest of 2
        /*
         * int A = 1;
         * int B = 5;
         * if(A >= B){
         * System.out.println("A is largest of 2");
         * }else{
         * System.out.println("B is largest of 2");
         * }
         */

        // Question No. (23): Print if a Number is Odd Or Even
        /*
         * Scanner sc = new Scanner(System.in);
         * int numner = sc.nextInt();
         * 
         * if(numner % 2 == 0){
         * System.out.println("Even");
         * }else{
         * System.out.println("Odd");
         * }
         */

        // Question No. (24): Income Tex Calculator
        /*
         * Scanner sc = new Scanner(System.in);
         * int income = sc.nextInt();
         * int tax;
         * if(income < 500000){
         * tax = 0;
         * }else if(income >= 500000 && income < 1000000){
         * tax = (int)(income * 0.2);
         * }else{
         * tax = (int)(income * 0.3);
         * }
         * System.out.println("Your Tax Is : " + tax);
         */

        // Question No. (25) : Print the largest of 3
        /*
         * int A = 1, B = 3, C = 6;
         * if ((A >= B) && (A >= C)) {
         * System.out.println("Largest of A");
         * } else if (B >= C) {
         * System.out.println("Largest is B");
         * } else {
         * System.out.println("Largest is C");
         * }
         */

        // Question No. (26): Check if a Student will Pass or Fail
        /*
         * int marks = 76;
         * 
         * String reportCard = (marks >= 33)? "Pass":"Fail";
         * System.out.println(reportCard);
         */

        // Question No. (27) : Calculator
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter a : ");
         * int a = sc.nextInt();
         * System.out.println("Enter b : ");
         * int b = sc.nextInt();
         * 
         * System.out.println("Enter Operator : ");
         * char operator = sc.next().charAt(0);
         * 
         * switch (operator) {
         * case '+':
         * System.out.println(a + b);
         * break;
         * case '-':
         * System.out.println(a - b);
         * break;
         * case '*':
         * System.out.println(a * b);
         * break;
         * case '/':
         * System.out.println(a / b);
         * break;
         * case '%':
         * System.out.println(a % b);
         * break;
         * default:
         * System.out.println("Error");
         * }
         */

        /*
         * // Question No. (28) : Write a Java program to get a number from the user and
         * print whether it is positive or negative.
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * 
         * if(n < 0){
         * System.out.println("Nnumber is Negative");
         * }else{
         * System.out.println("Number is Positive");
         * }
         */

        // Question No. (29) : Finish the following code so that it prints You have a
        // fever if your temperatureis above 100 and otherwise prints You don't have a
        // fever.
        /*
         * double temp = 103.5;
         * if(temp > 100){
         * System.out.println("You have a fever");
         * }else{
         * System.out.println("You don't have a fever");
         * }
         */

         /*
        // Question No. (30) : Write a Java program to input week number(1-7) and print day of week name using switch case.
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }
        */

        // Question No. (31) 
        /* 
        int a = 63,b = 36; 

        boolean x = (a<b)?true:false;
        int y= (a > b)? a:b;

        System.out.println(x);
        System.out.println(y);
        */

        // Question No. (32) : Write a Java program that takes a year from the user and print whether that year is a leap year or not
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year % 4) == 0){
            System.out.println("year is a leap year");
        }else{
            System.out.println("year is not a leap year");
        }
    }
}
