import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

public class StudentGrade {
    public static void main(String[] args) {
        Map<String, Student> StudentManager = new HashMap<>();
        try {
            StudentManager.put( " name " ,new Student("aline", 12) );
            StudentManager.put("Bob",new Student("Bob",34));
            StudentManager.put("Charlie",new Student("charlie",45));
            StudentManager.put("David",new Student("David",45));
            StudentManager.put("Elizabeth",new Student("elize",55));
            StudentManager.forEach((k, v) -> System.out.println(k + ": " + v));
            Map<String, Student> Sorted = new TreeMap<>(StudentManager);
            System.out.println("the sorted map is  :");
            Sorted.forEach((k, v) -> System.out.println(k + ": " + v));
            StudentManager.remove("Aline");
           Student max = Collections.max(StudentManager.values() ,  (s1, s2) -> Integer.compare(s1.Id, s2.Id));
           Student min = Collections.min(StudentManager.values(), (s1, s2) -> Integer.compare(s1.Id, s2.Id));
            System.out.println("the lowest  student manager is " + min);
//            System.out.println("" + "");
            System.out.println("the highest studentmanager  is " + max);


            if (StudentManager.isEmpty()){
                throw new IllegalArgumentException("The student manager is empty");
            }
//        System.out.println("the sorted map is:", + Sorted);
//        System.out.println(StudentManager.get("Aline"));
        }catch(NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("the student manager is completed ");
        }
    }
}
