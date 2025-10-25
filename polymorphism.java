public class polymorphism {
    public static void main(String args[]) {
        Calclulator calc=new Calclulator();
        System.out.println("The sum of 2 and 3 is: "+calc.sum(2, 3));
        System.out.println("The sum of 2, 3 and 4 is: "+calc.sum(2, 3, 4));
        System.out.println("The sum of 2.5 and 3.5 is: "+calc.sum(2.5f, 3.5f));
    }  
}
class Calclulator{
    int sum (int a,int b){
        return a+b;
    }
    int sum (int a,int b,int c){
        return a+b+c;
    }
    float sum(float a, float b){
        return a+b;
    }
}