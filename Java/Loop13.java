public class Loop13{
    public static void main(String args[]){
        // Pattern No. (1) :
        // *
        // * *
        // * * *
        // * * * *

        // 1st Approach
        // int line = 5;
        // for(int i = 0 ; i < line ; i++){
        //     for(int j = 0; j <= i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // 2nd Approach
        // int line = 5;
        // for(int i = 1 ; i <= line ; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Pattern No. (2) : 
        // Print Inverted-Star Pattern
        // * * * *
        // * * * 
        // * *
        // *
        // 1st approach
        // for(int i = 1; i <= 4; i++){
        //     for(int j = 4; j >= i ; j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // 2nd approach
        // int n= 4;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n - i + 1 ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Pattern No. (3) : Print Half-Pyramid Pattern
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // int n = 4;
        // for(int line = 1; line <= n; line++){
        //     for(int number = 1; number <= line; number++){
        //         System.out.print(number + " ");
        //     }
        //     System.out.println();
        // }

        // Pattern No. (4) : Pirnt Character Pattern
        // A
        // B C
        // D E F
        // G H I J
        // int n= 4;
        // char ch = 'A';
        // for(int line = 1; line <= n; line++){
        //     for(int chars = 1; chars <= line; chars++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }


    }
}