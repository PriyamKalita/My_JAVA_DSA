public class Bit_Qustion {
    public static void OddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String args[]) {
        // Question No. (1) : Check if a Number is ODD or EVEN
        OddOrEven(10001);
        OddOrEven(3);
        OddOrEven(11);
    }
}
