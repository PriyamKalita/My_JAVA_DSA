import java.util.Scanner;

public class TypeCasting4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a = 25.23f;
        int b = (int)a;
        System.out.println(b);

        char ch = 'a';
        char ch3 = 'b';
        int num3 = ch;
        int num4 = ch3;

        System.out.println(num3);
        System.out.println(num4);
    }
}
