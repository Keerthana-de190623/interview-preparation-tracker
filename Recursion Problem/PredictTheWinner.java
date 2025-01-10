public class PredictTheWinner {
    public boolean PredictWinner(int[] nums) {
        return helper(nums, 0, nums.length - 1) >= 0;
    }

    private int helper(int[] nums, int start, int end) {
        if (start == end) return nums[start];
        return Math.max(nums[start] - helper(nums, start + 1, end), 
                        nums[end] - helper(nums, start, end - 1));
    }

    public static void main(String[] args) {
        PredictTheWinner solution = new PredictTheWinner();
        int[] nums = {1, 5, 2};
        System.out.println(solution.PredictWinner(nums)); // false
        // true - {0,3}
    }
}
