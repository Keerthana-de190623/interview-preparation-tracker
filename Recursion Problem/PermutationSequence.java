import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    public static void main(String[] args) {
        int n = 3, k = 3;
        System.out.println(getPermutation(n, k));
    }

    public static String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        k--; 
        StringBuilder sb = new StringBuilder();
        getPermutationHelper(nums, k, sb);
        return sb.toString();
    }

    private static void getPermutationHelper(List<Integer> nums, int k, StringBuilder sb) {
        if (nums.isEmpty()) {
            return;
        }

        int n = nums.size();
        int fact = factorial(n - 1);
        int index = k / fact;
        sb.append(nums.remove(index));
        getPermutationHelper(nums, k % fact, sb);
    }

    private static int factorial(int n) {
        if (n == 0) return 1;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
