package recursion;

import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        sumTriangle(nums);
    }

    public static void sumTriangle(int[] nums) {
        // base case
        if (nums.length < 1) {
            return;
        }

        int[] arr = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            arr[i] = nums[i] + nums[i + 1];
        }

        sumTriangle(arr);

        // printing
        System.out.println(Arrays.toString(nums));
    }
}
