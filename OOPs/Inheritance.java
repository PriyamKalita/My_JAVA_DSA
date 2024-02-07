public class Inheritance{
    public static void main(String[] args) {
        // (1) Single Level Inheritance
//        Fish shark = new Fish();
//        shark.eat();

        // (2) Multi Level Inheritance
//        Dog dobby = new Dog();
//        dobby.eat();
//        dobby.legs = 4;
//        System.out.println(dobby.legs);

        // (3) Hierarchical Inheritance
        Bird b1 = new Bird();
        b1.fly();
        b1.eat();
    }
}

                // (1) Single Level Inheritance
// Base Class
//class  Animal{
//            String color;
//            void eat(){
//                System.out.println("Eats");
//            }
//            void breathe(){
//                System.out.println("Breaths");
//            }
//        }

// Derived Class
//class Fish extends Animal{
//            int fins;
//            void swim(){
//                System.out.println("Swim in water");
//            }
//        }

                // (2) Multi Level Inheritance

//class  Animal{
//    String color;
//    void eat(){
//        System.out.println("Eats");
//    }
//    void breathe(){
//        System.out.println("Breaths");
//    }
//}
//
//class Mammal extends Animal{
//    int legs;
//}
//class Dog extends Mammal{
//    String breed;
//}

                // (3) Hierarchical Inheritance
class  Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breaths");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("Walk");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}
