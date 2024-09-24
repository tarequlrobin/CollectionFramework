import java.util.HashMap;
import java.util.Map;

public class CustomObjectHashMapPractice {
    public static void main(String[] args) {
        Map<Student, Integer> students = new HashMap<>();

        students.put(new Student(1,"John"), 75);
        students.put(new Student(2,"Jane"), 90);
        students.put(new Student(3,"Bob"), 80);
        System.out.println(students);

        students.put(new Student(4,"John"), 75);
        System.out.println(students);

        System.out.println(students.size());

        for (Map.Entry<Student, Integer> entry : students.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            if (students.get(entry.getKey()) != null) {
                System.out.println(entry.getKey() + " " + students.get(entry.getKey()));
            }
        }
    }
}
