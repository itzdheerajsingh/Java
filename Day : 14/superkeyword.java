public class superkeyword {
    public static void main(String args[]){
        Dog d=new Dog(); // creating object of Dog class
        System.out.println(d.color);
    }
}
class Animal{ // parent class
    String color;// instance variable
    Animal(){ // parent class constructor
        System.out.println("Animal constructor called");// print statement
    }
}
class Dog extends Animal{

    Dog(){
        super.color="Brown"; // calling parent class constructor
        System.out.println("Dog constructor called");
    }
}