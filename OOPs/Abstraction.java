public class Abstraction{
    public static void main(String[] args) {
//        House h1 = new House();
//        h1.eat();
//        h1.walk();
//        System.out.println(h1.color);

//        Chicken c1 = new Chicken();
//        c1.eat();
//        c1.walk();

        Mustang myHours = new Mustang();
    }
}

abstract class Animal5{
    String color;
//    Animal5(){
//        color = "Brown";
//    }
    Animal5(){
        System.out.println("Animal Constructor Called");
    }
    void eat(){
        System.out.println("Animal Eats");
    }
    abstract void walk();
}

class House extends Animal5{
    House(){
        System.out.println("Hours Constructor Called");
    }
    void changeColor(){
        color = "Dark Brown";
    }
    void walk(){
        System.out.println("Walk on 4 lags");
    }
}

class Mustang extends House{
    Mustang(){
        System.out.println("Mustang Constructor Called");
    }
}
class Chicken extends Animal5{
    void changeColor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("Walk on 2 lags");
    }
}
