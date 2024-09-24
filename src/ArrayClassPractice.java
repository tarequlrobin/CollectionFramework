import java.util.Arrays;

public class ArrayClassPractice {
    public static void main(String[] args) {
        int[] arr = {5,6,8,2,9,4,3,7,5,6,8};
        int index = Arrays.binarySearch(arr, 6);
        System.out.println(index);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
