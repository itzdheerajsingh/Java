public class overriddding2 {
    public static int add(int a, int b){
        return a+b;
    }
    public static float add(float a, float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println("sum of int is : " + add(2,3));
        System.out.println("sum of float is : " + add(2.5f,3.5f));
    }
    
}
