import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

public class StudentGrade {
    public static void main(String[] args) {
        Map<String, Student> StudentManager = new HashMap<>();

        try {
            // Adding Student entries
            StudentManager.put(" name ", new Student("aline", 12));
            StudentManager.put("Bob", new Student("Bob", 34));
            StudentManager.put("Charlie", new Student("charlie", 45));
            StudentManager.put("David", new Student("David", 45));
            StudentManager.put("Elizabeth", new Student("elize", 55));

            // Displaying the original map
            System.out.println("The original student manager is:");
            StudentManager.forEach((k, v) -> System.out.println(k + ": " + v));

            // Sorting the map by keys
            Map<String, Student> Sorted = new TreeMap<>(StudentManager);
            System.out.println("\nThe sorted map is:");
            Sorted.forEach((k, v) -> System.out.println(k + ": " + v));

            // Removing an entry
            StudentManager.remove(" name ");

            // Finding max and min Student IDs
            Student max = Collections.max(StudentManager.values(), (s1, s2) -> Integer.compare(s1.Id, s2.Id));
            Student min = Collections.min(StudentManager.values(), (s1, s2) -> Integer.compare(s1.Id, s2.Id));
            System.out.println("\nThe student with the lowest ID is: " + min);
            System.out.println("The student with the highest ID is: " + max);

            // Throwing exception if map is empty
            if (StudentManager.isEmpty()) {
                throw new IllegalArgumentException("The student manager is empty");
            }
        } catch (NullPointerException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("\nThe student manager process is completed.");
        }
    }
}
//import java.util.HashMap;
//import java.util.Map;
//
//public class Main {
//    public static void main(String[] args) {
//        Map<Integer, String> students = new HashMap<>();
//        StudentManager manager = new StudentManager();
//
//        // Adding students
//        manager.addStudent(students, 101, "Alice");
//        manager.addStudent(students, 103, "Bob");
//        manager.addStudent(students, 102, "Charlie");
//
//        // Sorting students
//        manager.sortStudents(students);
//
//        // Searching for a student
//        manager.searchStudent(students, 103);
//
//        // Removing a student
//        manager.removeStudent(students, 101);
//
//        // Finding the student with the highest and lowest ID
//        manager.findStudentWithHighestId(students);
//        manager.findStudentWithLowestId(students);
//    }
//}
//import java.util.Map;
//import java.util.TreeMap;
//import java.util.Collections;
//
//public class StudentManager {
//
//    // Method to add a student
//    public void addStudent(Map<Integer, String> students, int studentId, String name) {
//        students.put(studentId, name);
//        System.out.println("Added Student - ID: " + studentId + ", Name: " + name);
//    }
//
//    // Method to sort students by ID
//    public void sortStudents(Map<Integer, String> students) {
//        Map<Integer, String> sortedStudents = new TreeMap<>(students);
//        System.out.println("Sorted Students by ID:");
//        sortedStudents.forEach((id, name) -> System.out.println("ID: " + id + ", Name: " + name));
//    }
//
//    // Method to search for a student by ID
//    public void searchStudent(Map<Integer, String> students, int studentId) {
//        if (students.containsKey(studentId)) {
//            System.out.println("Found Student - ID: " + studentId + ", Name: " + students.get(studentId));
//        } else {
//            System.out.println("Student with ID: " + studentId + " not found.");
//        }
//    }
//
//    // Method to remove a student by ID
//    public void removeStudent(Map<Integer, String> students, int studentId) {
//        if (students.containsKey(studentId)) {
//            students.remove(studentId);
//            System.out.println("Removed Student with ID: " + studentId);
//        } else {
//            System.out.println("Student with ID: " + studentId + " not found.");
//        }
//    }
//
//    // Method to find the student with the highest ID
//    public void findStudentWithHighestId(Map<Integer, String> students) {
//        if (!students.isEmpty()) {
//            int maxId = Collections.max(students.keySet());
//            System.out.println("Student with Highest ID - ID: " + maxId + ", Name: " + students.get(maxId));
//        } else {
//            System.out.println("No students in the list.");
//        }
//    }
//
//    // Method to find the student with the lowest ID
//    public void findStudentWithLowestId(Map<Integer, String> students) {
//        if (!students.isEmpty()) {
//            int minId = Collections.min(students.keySet());
//            System.out.println("Student with Lowest ID - ID: " + minId + ", Name: " + students.get(minId));
//        } else {
//            System.out.println("No students in the list.");
//        }
//    }
//}