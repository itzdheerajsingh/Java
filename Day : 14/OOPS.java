public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);

        // Changing color directly (not recommended but works)
        p1.color = "red";
        System.out.println(p1.color);
    }
}

class Pen {
    String color;
    String type;
    int tip; // declare tip

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3f; //  use 3f to get float division
    }
}
