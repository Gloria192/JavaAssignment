import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input and create a Bird object
        System.out.println("Enter the name of the bird:");
        String birdName = sc.nextLine();
        System.out.println("Enter the sound of the bird:");
        String birdSound = sc.nextLine();
        Bird myBird = new Bird(birdName, birdSound);

        // Bird Actions
        System.out.println("\nBird Actions:");
        myBird.makeSound();
        myBird.fly();

        sc.close(); // Close the scanner
    }
}