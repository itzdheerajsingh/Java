public class herarichalinheritance {
  //single-level and multi-level inheritance example in Java
    public static void main(String[] args) {
        Mamal small=new Mamal();
        small.sound();
        Dog bobby=new Dog();
        bobby.sound();
        
        }
}

// 
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


class Fish extends Animal{
    int legs;
    void swim(){
        System.out.println(" is swimming...");
    }
}


class Dog extends Animal{
    int breed;
    
    void bark(){
        System.out.println(" is barking...");
    }
}  


class Cat extends Animal{
    int eyes;
    void meow(){
        System.out.println(" is meowing...");
    }
}

