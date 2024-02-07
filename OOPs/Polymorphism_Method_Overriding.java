public class Polymorphism_Method_Overriding {
    public static void main(String args[]){
        Deer d1 = new Deer();
        d1.eat();
    }
}
class Animal3{
    void eat(){
        System.out.println("Eat Anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eat Grass");
    }
}
