import javax.swing.text.AbstractDocument.Content;

public class FlowControl11 {
    public static void main(String args[]){
        // While Loop
        System.out.println("Print Hello World Using while Loop");
        int counter = 0;
        while(counter < 10){
            System.out.println("Hello World");
            counter++;
        }
        System.out.println();
        System.out.println("Print Hello World Using For Loop");

        // For Loop
        for(int i = 1; i <= 10; i++){
            System.out.println("Hello World");
        }

        System.out.println();
        System.out.println("Print Hello World Using Do While loop");
        // Do While Loop
        int counter3 = 1;
        do{
            System.out.println("Hello World");
            counter3++;
        }while(counter3 <= 10);

        System.out.println();

        // Break Statement
        System.out.println("Break Statement");
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        //continue Statement
        System.out.println("Continue Statement");
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                continue;
            }
            System.out.print(i + " ");
        }


    }
}
