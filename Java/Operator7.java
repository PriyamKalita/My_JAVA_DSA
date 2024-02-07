public class Operator7{
    public static void main(String args[]){
        // (1) Arithmetic Operators

        // (i) Binary Operator
        int A = 10;
        int B = 5;
        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);

        // (ii) Unary Operator
        // Pre Increment
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        // Post Increment
        int a3 = 10;
        int b3 = a3++;
        System.out.println(a3);
        System.out.println(b3);

        // Pre Decrement
        int a4 = 10;
        int b4 = --a4;
        System.out.println(a4);
        System.out.println(b4);

        // Post Decrement
        int a5 = 10;
        int b5 = a5--;
        System.out.println(a5);
        System.out.println(b5);

        // (2) Relational Operator
        int A6 = 10;
        int B6 = 11;
        System.out.println(A6 == B6);
        System.out.println(A6 != B6);
        System.out.println(A6 > B6);
        System.out.println(A6 < B6);
        System.out.println(A6 >= B6);
        System.out.println(A6 <= B6);

        // (3) Logical Operator

        // (i) Logical AND (&&)
        System.out.println((3 > 2) && ( 5 > 2));
        System.out.println((3 < 2) && ( 5 > 2));
        System.out.println((3 > 2) && ( 5 < 2));
        System.out.println((3 < 2) && ( 5 < 2));

        // (ii) Logical OR (||)
        System.out.println((3 > 2) || ( 5 > 2));
        System.out.println((3 < 2) || ( 5 > 2));
        System.out.println((3 > 2) || ( 5 < 2));
        System.out.println((3 < 2) || ( 5 < 2));

        // (iii) Logical NOT (!)
        System.out.println(!(3 > 2));
        System.out.println(!(3 < 2));

        // (4) Assignment Operator
        int A3 = 10;
        A += 10;
        System.out.println(A);

        int B3 = 10;
        B3 -= 10;
        System.out.println(B3);

        int C3 = 10;
        C3 *= 10;
        System.out.println(C3);

        int D3 = 10;
        D3 /= 10;
        System.out.println(D3);

        int E3 = 10;
        E3 %= 10;
        System.out.println(E3);

    }
}