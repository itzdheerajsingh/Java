//single-level and multi-level inheritance example in Java
public class inheritance {
    public static void main(String[] args) {
        Mamal small=new Mamal();
        small.sound();
        Dog bobby=new Dog();
        bobby.sound();
        bobby.legs=4;
        System.out.println("Dog has "+bobby.legs+" legs and breed no is "+bobby.breed);
    }
}

// Base class (Parent)
class Animal {
    String color;

    // Method
    void sound() {
        System.out.println(" makes a sound");
    }

    void eat() {
        System.out.println( " is eating...");
    }
}

// Derived class (Child) i.e. single-level inheritance
class Mamal extends Animal{
    int legs;
}

// Further derived class (Grandchild)  i.e. multi-level inheritance
class Dog extends Mamal{
    int breed;
}
