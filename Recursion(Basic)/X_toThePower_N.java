public class X_toThePower_N {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int xnm1 = power(x,  n - 1);
        int xn = x * xnm1;
        return xn;

        // return x * power(x, n - 1);
    }

    public static int OptimizedPower(int x, int n){
        if(n == 0){
            return 1;
        }

        // int halfPower = OptimizedPower(x, n / 2) * OptimizedPower(x, n / 2);
        int half

        if(n % 2 != 0){
            halfPower = x * halfPower;
        }
        return halfPower;
    }
    public static void main(String args[]){
        System.out.println(power(2, 10));

        System.out.println(power(2, 5));
    }
}
