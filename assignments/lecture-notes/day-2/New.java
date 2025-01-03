import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class New {
    public static void main(String[] args) {
        // int num = Integer.MIN_VALUE;
        // System.out.println(num);

        // ArrayList<Integer> result = new ArrayList<>();

        // System.out.println(result.size());

        int[] nums = { 1, 2, 3, 4, 5 };
        change(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void change(int[] arr) {
        arr[3] = 10;
    }

}
