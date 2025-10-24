// File: OOPsDemo.java

// Base class (Parent)
abstract class Animal {
    String name;

    Animal(String name) { // Constructor
        this.name = name;
    }

    // Abstract method (no body)
    abstract void sound();

    // Concrete method
    void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

// Derived class (Child)
class Dog extends Animal {
    private String breed; // encapsulated property

    // Constructor using super keyword
    Dog(String name, String breed) {
        super(name); // calling parent constructor
        this.breed = breed;
    }

    // Getter and Setter (Encapsulation)
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Overriding method (Polymorphism)
    @Override
    void sound() {
        System.out.println(name + " says: Woof Woof 🐶");
    }
}

// Another subclass
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Meow 🐱");
    }
}

// Class to demonstrate method overloading (Compile-time Polymorphism)
class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Main class
public class OOPsDemo {
    public static void main(String[] args) {
        // Objects creation (Instantiation)
        Dog d1 = new Dog("Bruno", "Labrador");
        Cat c1 = new Cat("Misty");

        // Accessing methods
        d1.sound();
        d1.sleep();
        System.out.println("Breed: " + d1.getBreed());
        d1.setBreed("Golden Retriever");
        System.out.println("Updated Breed: " + d1.getBreed());
        System.out.println();

        c1.sound();
        c1.sleep();
        System.out.println();

        // Demonstrating Polymorphism
        Animal a1 = new Dog("Rocky", "Bulldog");
        a1.sound(); // runtime polymorphism

        System.out.println();

        // Demonstrating Method Overloading
        MathOperation math = new MathOperation();
        System.out.println("Sum (int): " + math.add(5, 10));
        System.out.println("Sum (double): " + math.add(5.5, 4.5));
        System.out.println("Sum (3 int): " + math.add(2, 3, 4));
    }
}
