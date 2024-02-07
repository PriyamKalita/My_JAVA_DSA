public class BinaryToDecimalAndDecimalToBinary17 {
    public static void binToDes(int binNum){
        int myNum = binNum;
        int pow = 0;
        int desNum = 0;
        while(binNum > 0){
            int lastDigit = binNum % 10;
                                            // Math.pow() function always return double value
            desNum = desNum + (lastDigit + (int)Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;

        }
        System.out.println("Decimal of " + myNum + " " + desNum);
    }

    public static void desToBin(int desNum){
        int myNum = desNum;
        int pow = 0;
        int binNum = 0;

        while(desNum > 0){
            int rem = desNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            desNum = desNum / 2;
        }
        System.out.println("Binary form of " + myNum + " " + binNum);
    }
    public static void main(String args[]){
        binToDes(10001);

        desToBin(5);

    }
    
}
