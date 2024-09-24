import java.util.ArrayDeque;

public class ArrayDequeuePractice {
    public static void main(String[] args) {
        ArrayDeque<Integer> integerArrayDeque = new ArrayDeque<>();

        integerArrayDeque.offer(1);
        integerArrayDeque.offer(2);
        integerArrayDeque.offer(3);
        integerArrayDeque.offer(4);
        integerArrayDeque.offer(5);

        System.out.println(integerArrayDeque);

        integerArrayDeque.offerFirst(77);
        integerArrayDeque.offerLast(88);
        System.out.println(integerArrayDeque);

        System.out.println(integerArrayDeque.peek());
        System.out.println(integerArrayDeque.peekFirst());
        System.out.println(integerArrayDeque.peekLast());
        System.out.println(integerArrayDeque);

        System.out.println(integerArrayDeque.poll());
        System.out.println(integerArrayDeque.pollFirst());
        System.out.println(integerArrayDeque.pollLast());
        System.out.println(integerArrayDeque);
    }
}
