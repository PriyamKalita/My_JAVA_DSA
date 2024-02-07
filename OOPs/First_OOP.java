public class First_OOP{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        BackAccount myAccount = new BackAccount();
        myAccount.userName = "Priyam Kalita";
        myAccount.setPassWord("oebfouh");
        System.out.println(myAccount.userName);

    }
}
class Pen {
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class BackAccount{
    public String userName;
    private String PassWord;
    public void setPassWord(String NewPassWord){
        PassWord = NewPassWord;
    }
}