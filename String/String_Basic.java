import java.util.*;

public class String_Basic {
    public static void printLettesr(String FullName){
        for(int i = 0; i < FullName.length(); i++){
            System.out.println(FullName.charAt(i));
        }
    }
    public static void main(String args[]) {

        // NOTE : Strings are immutable in Java.
        // This means that once a string is created,
        // its contents cannot be changed.

        // Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        // System.out.println(s);

        // Scanner sc = new Scanner(System.in);
        // String s3 = sc.nextLine();
        // System.out.println(s3);
        // System.out.println(s3.length());

        // Concatenation : Concatenation is the process of joining two or more strings together
        String FistName = "Hello";
        String LastName = "World";
        String FullName = FistName + " " + LastName;
        System.out.println(FullName);
        System.out.println(FullName.charAt(0));

        printLettesr(FullName);
    }
}