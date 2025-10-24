// File: ClassExample.java

// A "class" is like a blueprint or template.
// It defines how objects (real things) will look and behave.
class Pen {

    // --- Properties (also called attributes or fields) ---
    String color;
    String type; // e.g., gel, ballpoint, ink, etc.

    // --- Methods (define behavior) ---
    void write() {
        System.out.println("Writing something with a " + color + " " + type + " pen.");
    }

    void printColor() {
        System.out.println("Pen color is: " + color);
    }
}

// The main class — execution starts from here
public class ClassExample {
    public static void main(String[] args) {

        // Creating objects (instances) of the class Pen
        Pen p1 = new Pen(); // object 1
        Pen p2 = new Pen(); // object 2

        // Assigning values to object properties
        p1.color = "Blue";
        p1.type = "Gel";

        p2.color = "Black";
        p2.type = "Ballpoint";

        // Calling methods using objects
        p1.write();
        p1.printColor();

        p2.write();
        p2.printColor();
    }
}
