public class gettersetter {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("blue");
        p1.setTip(5);
        System.out.println(p1.getcolor());
        System.out.println(p1.gettip());
        //p1.setColor("red");
       p1.setColor("red");
       System.out.println(p1.getcolor());
    }
}
class Pen{
    private String color;
    private int tip;
    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}   