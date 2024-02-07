public class Constructors {
    public static void main(String args[]){
        Student s = new Student("Priyam Kalita");
        System.out.println(s.name);

        Student s3 = new Student();
    }
}

class Student{
    String name;
    int rollNumber;

    // Prarameterized Constructors
    Student(String name){
        this.name = name;
    }

    // Non Prarameterized Constructors
    Student(){
        System.out.println(3);;
    }
}
