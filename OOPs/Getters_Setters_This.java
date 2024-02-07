public class Getters_Setters_This {
    public static void main(String args[]){
        Pen3 p3 = new Pen3();
        p3.setColor("Yellow");
        System.out.println(p3.getColor());

        p3.setTip(6);
        System.out.println(p3.getTip());


    }
}
class Pen3{
    String color;
    int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
}