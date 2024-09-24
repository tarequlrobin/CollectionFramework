import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClassPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(4);

        System.out.println(list);

        System.out.println("Min: "+ Collections.min(list));
        System.out.println("Max: "+ Collections.max(list));
        System.out.println("Frequency: "+ Collections.frequency(list, 4));

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

        List<Students> students = new ArrayList<>();

        students.add(new Students(4,"John"));
        students.add(new Students(2,"Jane"));
        students.add(new Students(1,"John"));
        students.add(new Students(3,"Bob"));

        Collections.sort(students);
        System.out.println(students);
    }
}
