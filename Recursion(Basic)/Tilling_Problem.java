public class Tilling_Problem{
    public static int tilingProblem(int n){
        // Base Case
        if(n == 0 || n == 1){
            return 1;
        }

        // Vertical Choice
        int fnm1 = tilingProblem(n - 1);

        // Horizontal Choice
        int fnm2 = tilingProblem(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String args[]){
        System.out.println(tilingProblem(3));
    }
}