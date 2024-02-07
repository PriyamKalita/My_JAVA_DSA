public class String_Function_Compare{
    public static void main(String args[]){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        if(s1 == s2){
            System.out.println("String are Equale");
        }else{
            System.out.println("String are not Equale");
        }

        if(s1 == s3){
            System.out.println("String are Equale");
        }else{
            System.out.println("String are not Equale");
        }
        if(s1.equals(s3)){
            System.out.println("String are Equale");
        }else{
            System.out.println("String are not Equale");
        }



    }
}