import java.util.Scanner;

public class Creating_An_Array{
    public static void update(int marks[]){
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
            // System.out.println(marks[i]);
        }
    }
    public static void main(String args[]){
        
        /* 
        // Creating an Array
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        int percenatge = (marks[0] + marks[1] + marks[2])/ 3;
        System.out.println(percenatge);

        // Update
        // marks[2] = marks[2] + 1;
        // System.out.println(marks[2]);

        // Length of Array
        System.out.println(marks.length);

        */

        int marks[] = {93, 78, 99};
        update(marks);

        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}