import java.util.Scanner;

public class VariabllesAndDataTypeQuestion6 {
    public static void main(String args[]){
        // Question No. (14) : In a Program input 3 number A, B and C . You have to output the average of thses 3 number
        /*
        Scanner sc = new Scanner(System.in);
        float A = sc.nextInt();
        float B = sc.nextInt();
        float C = sc.nextInt();
        float avg = (A + B + C) / 3;
        System.out.println(avg);
        */

        // Question No. (15) : In a program , input the side of a square.You have to out put the area of the square.
        // Arear of Square = (side)^2
        /* 
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side * side;
        System.out.println(area);
        */

        // Question No. (16) : Enter cost of 3 items from the user(using float datatype)-a pencil, a penandan eraser. You have to output the total cost of the items back to the user as their bill
        Scanner sc = new Scanner(System.in);
        float iteam1 = sc.nextFloat();
        float iteam2 = sc.nextFloat();
        float iteam3 = sc.nextFloat();

        float total = iteam1 + iteam2 + iteam3;
        System.out.println(total);

        float totalWithtax = total + (0.18f * total);
        System.out.println(totalWithtax);

    }
}
