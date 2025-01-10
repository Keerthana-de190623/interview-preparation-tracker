
public class TargetSum {

    public static int findTargetSumWays(int[] nums, int target) {
        return helper(nums, target, 0, 0);
    }

    private static int helper(int[] nums, int target, int index, int sum) {
        if (index == nums.length) {
            return sum == target ? 1 : 0;
        }

        return helper(nums, target, index + 1, sum + nums[index])
                + helper(nums, target, index + 1, sum - nums[index]);
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(findTargetSumWays(nums, target)); // Output: 5
    }
}
