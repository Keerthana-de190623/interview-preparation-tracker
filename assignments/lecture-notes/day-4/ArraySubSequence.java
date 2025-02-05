
import java.util.ArrayList;
import java.util.Arrays;

public class ArraySubSequence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        printSubSequence(arr);
    }

    public static void printSubSequence(int[] nums) {
        ArrayList<Integer> processed = new ArrayList<>();
        // helperPrint(processed, nums, 0);
        int count = helperCountReturn(processed, nums, 0);
        System.out.println(count);
    }

    public static void helperPrint(ArrayList<Integer> processed, int[] unprocessed, int index) {
        if (index == unprocessed.length) {
            System.out.println(processed);
            return;
        }

        processed.add(unprocessed[index]);
        // take it
        helperPrint(processed, unprocessed, index + 1);
        processed.remove(processed.size() - 1);

        // leave it
        helperPrint(processed, unprocessed, index + 1);
    }

    public static int helperCountReturn(ArrayList<Integer> processed, int[] unprocessed, int index) {
        if (index == unprocessed.length) {
            System.out.println(processed);
            return 1;
        }

        processed.add(unprocessed[index]);
        // take it
        int left = helperCountReturn(processed, unprocessed, index + 1);
        processed.remove(processed.size() - 1);

        // leave it
        int right = helperCountReturn(processed, unprocessed, index + 1);

        return left + right;
    }
}
