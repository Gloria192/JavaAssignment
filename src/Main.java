import java.util.Arrays;
import java.util.Scanner;

// Class to manage student grades
class GradeManager1 {
    // Adds grades to the array (resize if needed)
    public int[] addGrade(int[] grades, int grade, int count) {
        if (grade < 0) { // Grade cannot be negative
            throw new IllegalArgumentException("Grade cannot be negative.");
        }
        if (count == grades.length) { // If the array is full, resize
            int[] newGrades = new int[grades.length * 2];
            System.arraycopy(grades, 0, newGrades, 0, grades.length);
            grades = newGrades; // Replace old array with the resized array
        }
        grades[count] = grade; // Add grade at the correct position
        return grades; // Return the updated grades array
    }

    // Sorts grades in ascending order
    public void sortGrades(int[] grades, int count) {
        Arrays.sort(grades, 0, count); // Sort only the valid grades
    }

    // Searches for a specific grade
    public int searchGrade(int[] grades, int grade, int count) {
        for (int i = 0; i < count; i++) {
            if (grades[i] == grade) {
                return i; // Grade found at index i
            }
        }
        return -1; // Grade not found
    }

    // Calculates the average grade
    public double calculateAverage(int[] grades, int count) {
        if (count == 0) { // If no grades are available, throw exception
            throw new IllegalStateException("No grades available to calculate average.");
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += grades[i]; // Add grades to sum
        }
        return (double) sum / count; // Calculate average
    }

    // Finds the highest grade
    public int findHighestGrade(int[] grades, int count) {
        if (count == 0) { // If no grades are available, throw exception
            throw new IllegalStateException("No grades available to find the highest grade.");
        }
        int highest = grades[0]; // Start with the first grade
        for (int i = 1; i < count; i++) {
            if (grades[i] > highest) {
                highest = grades[i]; // Update highest if a larger grade is found
            }
        }
        return highest; // Return the highest grade
    }

    // Finds the lowest grade
    public int findLowestGrade(int[] grades, int count) {
        if (count == 0) { // If no grades are available, throw exception
            throw new IllegalStateException("No grades available to find the lowest grade.");
        }
        int lowest = grades[0]; // Start with the first grade
        for (int i = 1; i < count; i++) {
            if (grades[i] < lowest) {
                lowest = grades[i]; // Update lowest if a smaller grade is found
            }
        }
        return lowest; // Return the lowest grade
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt(); // Number of students

        int[] grades = new int[n]; // Initialize grades array
        int count = 0; // Counter for number of grades entered

        GradeManager1 manager = new GradeManager1();

        System.out.println("Enter the grades of students (enter -1 to stop): ");
        while (true) {
            try {
                int grade = sc.nextInt();
                if (grade == -1) { // Stop when -1 is entered
                    break;
                }
                grades = manager.addGrade(grades, grade, count);
                count++; // Increment count after adding a valid grade
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage()); // Handle negative grades
            }
        }

        manager.sortGrades(grades, count); // Sort the grades
        System.out.println("Sorted grades: " + Arrays.toString(Arrays.copyOf(grades, count))); // Display sorted grades

        System.out.println("Enter a grade to search: ");
        int target = sc.nextInt();
        int index = manager.searchGrade(grades, target, count); // Search for a grade
        if (index != -1) {
            System.out.println("Grade " + target + " found at index " + index + ".");
        } else {
            System.out.println("Grade " + target + " not found.");
        }

        double average = manager.calculateAverage(grades, count); // Calculate average
        System.out.println("Average grade: " + average);

        int highest = manager.findHighestGrade(grades, count); // Find highest grade
        System.out.println("Highest grade: " + highest);

        int lowest = manager.findLowestGrade(grades, count); // Find lowest grade
        System.out.println("Lowest grade: " + lowest);

        sc.close(); // Close scanner
    }
}
