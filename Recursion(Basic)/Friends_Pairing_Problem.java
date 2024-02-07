public class Friends_Pairing_Problem {
    public static int FriendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        // Choice
        // Single
        int fnm1 = FriendsPairing(n - 1);

        // Pair
        int fnm2 = FriendsPairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        // Total Ways
        int TotalWays = fnm1 + fnm2;
        return TotalWays;
    }
    public static void main(String args[]){
        System.out.println(FriendsPairing(3));

    }
}
