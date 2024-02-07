import java.util.*;
public class TypeConversion3{
    public static void main(String args[]){
        // Type Conversion
        int a = 25;
        long b = a;
        System.out.println(b);

        // Byte -> Short -> int -> float -> Long -> Double
        Scanner sc = new Scanner(System.in);
        // float num = sc.nextInt(); // Conversion is possible because for "Int have 4 byte and float 8 byte"
        // System.out.println(num);

        // Conversion is not possible because for "Int have 4 byte and float 8 byte"
        // int num3 = sc.nextFloat(); // error: incompatible types: possible lossy conversion from float to int 
        // System.out.println(num3);
    }
}

