public class Static_KeyWord{
    public static void main(String[] args) {
        Student3 s1 = new Student3();
        s1.schoolName = "anc";

        Student3 s2 = new Student3();
        System.out.println(s2.schoolName);

        Student3 s3 = new Student3();
        s1.schoolName = "Xnc";
        System.out.println(s3.schoolName);
    }
}
class Student3{

    static int returnPercentage(int math, int phy, int chem){
        return (math + phy + chem) / 3;
    }

    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
