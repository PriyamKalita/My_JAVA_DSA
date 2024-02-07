public class FunctionAnsMethods15 {
    public static int factorial(int n){
        int fact = 1;
        
        for(int i = 1; i <= n; i++){
            fact = fact * i;
            
        }
        return fact;
    }

    public static int binomialCoefficinet(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n - r);

        int binomialCoeffi = fact_n / (fact_r * fact_n_r);
        return binomialCoeffi; 
    }    public static void main(String args[]){
        System.out.println(factorial(5));

        System.out.println(binomialCoefficinet(5, 3));


    }
}
