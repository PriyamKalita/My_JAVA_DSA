public class Bit_Operations {
    // Get ith Bit
    public static int getIthBit(int n , int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    

    // Set ith Bit
    public static int setIthBit(int n, int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // Clear Ith Bit
    public static int clearIthBit(int n, int i){
        int bitMask = ~(i << i);
        return n & bitMask;
    }

    // Update Ith Bit
    public static int UpdateIthBit(int n, int i, int newBit){
        // Approach (1)
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }

        // Approach (2)
        n = clearIthBit(n, i);
        int BitMask = newBit << i;
        return BitMask | n;
    }

    // clear Last i Bit
    public static int clear_Last_i_Bit(int n, int i){
        int BitMask = (~0) << i;
        return n & BitMask;
    }

    // Clear Range Of Bits
    public static int ClearRangeOfBits(int n, int i, int j){
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String args[]){
        System.out.println(getIthBit(10, 2));

        System.out.println(setIthBit(10, 3));

        System.out.println(clearIthBit(100, 1));

        System.out.println(UpdateIthBit(10, 1, 1));

        System.out.println(clear_Last_i_Bit(15, 2));

        System.out.println(ClearRangeOfBits(10, 2, 4));
    }
}
