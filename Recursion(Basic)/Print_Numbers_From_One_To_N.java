public class Print_Numbers_From_One_To_N {
    public static void printIncreasing(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printIncreasing(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String args[]){
        int n = 10;
        printIncreasing(n);
    }
}
