import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueuePractice {
    public static void main(String[] args) {
        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);

        System.out.println(pq);

        System.out.println(pq.peek());

        System.out.println(pq.poll());

        System.out.println(pq);
    }
}
