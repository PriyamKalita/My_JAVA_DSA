import java.util.Scanner;

public class Bit_Manipulation_Question {
    // Question No. (1) : Check if a number is a Power of 2 or not
    public static boolean PowerOfTwoOrNot(int n) {
        return (n & (n - 1)) == 0;
    }

    // Question No. (2) : Count Set Bit in a Number
    public static int CountSetBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    // Question No. (3) : Fast Exponentiation
    public static int FastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    // Question No. (4) : What is the value of x^x for any value of x?
    public static int xToThePowerOfX(int x) {
        if (x == 0) {
            return 1;
        } else {
            int result = 1;
            for (int i = 0; i < x; i++) {
                result *= x;
            }
            return result;
        }
    }

    public static void main(String args[]) {
        System.out.println(PowerOfTwoOrNot(16));

        System.out.println(CountSetBit(10));

        System.out.println(FastExpo(3, 5));

        System.out.println(xToThePowerOfX(10));

        // Question No. (5) :  Swap two numbers without using any third variable
        int x = 3;
        int y = 4;
        System.out.println("Before swap: x = " + x + " and y = " + y);
        //swap using xor
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap: x = " + x + " and y = " + y);

        for(char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println((char)(ch|' '));
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt(i);
        }
        int even=0;
        int odd=0;
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        
        System.out.print(odd+" "+even);

    }
}