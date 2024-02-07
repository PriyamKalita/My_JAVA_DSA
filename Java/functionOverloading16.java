public class functionOverloading16 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n == 2) {
            return true;
        }
        // for(int i = 2; i <= n -1; i++){
        // if(n % 2 == 0){
        // isPrime = false;
        // break;
        // }
        // }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
        // return isPrime;
    }

    // Print all Prime in Range
    public static void primeRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3, 5, 6));
        System.out.println(sum(3.2f, 4.5f));

        System.out.println(isPrime(5));

        primeRange(12);

    }

}
