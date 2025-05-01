import java.util.Scanner;

// Base class: Animal
public class Animal {
    String name;
    String sound;

    // Constructor
    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    // Method to make a sound
    public void makeSound() {
        System.out.println(name + " makes a sound: " + sound);
    }
}

// Subclass: Bird
class Bird extends Animal {

    // Constructor
    public Bird(String name, String sound) {
        super(name, sound); // Call the superclass constructor
    }

    // Method to represent flying behavior
    public void fly() {
        System.out.println(name + " is flying!");
    }

    // Override makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " chirps: " + sound);
    }
}