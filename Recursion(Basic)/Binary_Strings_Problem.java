public class Binary_Strings_Problem {
    public static void PrintBinaryStrings(int n, int lastPlace, String str){
        // if(lastPlace == 0){
        //     PrintBinaryStrings(n - 1, 0, str.append("0"));
        //     PrintBinaryStrings(n - 1, 1, str.append("1"));
        // }else{
        //     PrintBinaryStrings(n - 1, 0, str.append("0"));
        // }

        if(n == 0){
            System.out.println(str);
            return;
        }

        PrintBinaryStrings(n - 1, 1, str + "0");
        if(lastPlace == 0){
            PrintBinaryStrings(n - 1, 1, str + "1");
        }
        
    }
    public static void main(String args[]){
        PrintBinaryStrings(3, 0, "");
    }
}
