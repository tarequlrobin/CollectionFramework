import java.util.HashSet;
import java.util.Set;

public class CustomObjectHashSetPractice {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student(5,"John"));
        studentSet.add(new Student(6,"Jane"));
        studentSet.add(new Student(7,"Jack"));
        studentSet.add(new Student(8,"Jill"));
        studentSet.add(new Student(9,"Joe"));

        System.out.println(studentSet);

        studentSet.add(new Student(10,"Jack"));
        studentSet.add(new Student(6,"Jan"));

        System.out.println(studentSet);

    }
}
