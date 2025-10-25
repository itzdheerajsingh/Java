//run time polymorphism i.e. method overriding example in Java
public class polymorphism2 {
    public static void main(String args[]){
        Deer d=new Deer();
        d.eat();
        Animal a=new Animal();
        a.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Animal eats anything...");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("deer eats grass...");
    }
}