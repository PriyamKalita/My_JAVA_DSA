public class PatternAdvanced {

    // Pattern : HollowRectangle
    public static void hollowRectangle(int totalRows, int totalColumn) {
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= totalColumn; j++) {
                if (i == 1 || i == totalRows || j == 1 || j == totalColumn) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    // Inverted and Rotated Half- Pyramid
    public static void InvertedAndRotatedHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Inverted Half Pyramid With Number
    public static void InvertedHalfPyramidWithNumber(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // FloydsTriangle
    public static void FloydsTriangle(int n){
        int counter = 1;
        for(int i = 1; i <= n ; i++){
            // Inner - How many times will counter be printed
            for(int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    // 0-1 Triangle
    public static void Zero_One_Triangle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i + j) % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    // Butterfly Pattern
    public static void ButterflyPattern(int n){
        for(int i = 1; i <= n; i++){
            // Star
            for(int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            // Spaces
            for(int j = 1; j <= 2*(n - i) ; j++){
                System.out.print(" ");
            }
            // star
            for(int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n; i >= 1; i--){
            // Star
            for(int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            // Spaces
            for(int j = 1; j <= 2*(n - i) ; j++){
                System.out.print(" ");
            }
            // star
            for(int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Solid Rhimbus
    public static void SolidRhimbus(int n){
        for(int i = 1; i <= n; i++){
            // Spaces
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            // Star
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Hollow Rhombus
    public static void hollowRhumbus(int n){
        for(int i = 1; i <= n; i++){
            // Spaces
            for(int j = 1; j <= n- i; j++){
                System.out.print(" ");
            }
            // hollow Rectangle
            for(int j = 1; j <= n; j++){
                if(i == 1 || j == 1 || i == n || j== n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // DiamondPattern
    public static void DiamondPattern(int n){
        for(int i = 0; i <= n; i++){
            // Space
            for(int j = 1; j <= n- i; j++){
                System.out.print(" ");
            }
            // Star
             for(int j = 1; j <= 2*i- 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){
            // Space
            for(int j = 1; j <= n- i; j++){
                System.out.print(" ");
            }
            // Star
             for(int j = 1; j <= 2*i- 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    

    public static void main(String args[]) {
        /*
         ******
         *    *
         *    *
         *    *
         ******
         */
        hollowRectangle(5, 6);
        /*
             *
            **
           ***
          ****
         *****
         */
        InvertedAndRotatedHalfPyramid(5);
        /*
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
        */
        InvertedHalfPyramidWithNumber(5);
        /*
         1
         2  3
         4  5  6
         7  8  9 10
        11 12 13 14
        */
        FloydsTriangle(5);
        /*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
        */
        Zero_One_Triangle(5);
        /*
        *             *
        * *         * *
        * * *     * * *
        * * * * * * * *
        * * * * * * * *
        * * *     * * *
        * *         * *
        *             *
        */
        ButterflyPattern(4);

        /* 
                * * * * 
              * * * * 
            * * * * 
          * * * * 
        * * * * 
        */
        SolidRhimbus(5);
        
        /*
                * * * * 
              *     * 
            *     * 
          *     * 
        * * * * 
        */
        hollowRhumbus(5);

        /*
              *
            * * *
          * * * * *
        * * * * * * *
        * * * * * * *
          * * * * *
            * * *
              *
        */
        DiamondPattern(5);

    }
}
