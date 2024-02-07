import java.util.Scanner;

public class FunctionAnsMethods14 {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }

    public static void calculateSum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is : " + sum);
        return;
    }

    public static void calculatePro(int a, int b) {
        int pro = a * b;
        System.out.println("Product is : " + pro);
        return;
    }

    public static int calculatediv(int a, int b) { // Parameters or Formal Parameter : A variable and its type as they
                                                   // appear in the prototype of the function or method.
        int div = a / b;
        return div;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String args[]) {
        printHelloWorld(); // Function Call

        calculateSum();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculatePro(a, b);

        Scanner scn = new Scanner(System.in);
        int a3 = sc.nextInt();
        int b3 = sc.nextInt();
        int div = calculatediv(a3, b3); // Arguments or actual Parameter : The variable or expression corresponding to a
                                        // formal parameter that appears in the function or method call in the calling
                                        // environment.
        System.out.println("Division is : " + div);

        // Swap Two Number
        int a5 = 10;
        int b5 = 5;
        swap(a5, b5);

        int d = 4;
        int g = 5;
        int product = multiply(d, g);
        System.out.println("a * b  = " + product);
        product = multiply(10, 20);
        System.out.println(product);

    }
}
