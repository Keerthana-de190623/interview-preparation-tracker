import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 6, 7 };
        int target = 7;
        // combinationSumPrint(nums, target);
        System.out.println(combinationSumReturn(nums, target));
    }

    public static void combinationSumPrint(int[] nums, int target) {
        helperPrint(new ArrayList<>(), nums, 0, target);
    }

    public static void helperPrint(ArrayList<Integer> processed, int[] unprocessed, int index, int target) {
        if (target == 0) {
            System.out.println(processed);
            return;
        }

        if (target < 0 || index == unprocessed.length) {
            return;
        }

        processed.add(unprocessed[index]);
        // Take it
        helperPrint(processed, unprocessed, index, target - unprocessed[index]);
        processed.remove(processed.size() - 1);

        // Leave it
        helperPrint(processed, unprocessed, index + 1, target);
    }

    public static List<List<Integer>> combinationSumReturn(int[] nums, int target) {
        return helperReturn(new ArrayList<>(), nums, 0, target);
    }

    public static List<List<Integer>> helperReturn(ArrayList<Integer> processed, int[] unprocessed, int index,
            int target) {
        if (target == 0) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>(processed));
            return result;
        }

        if (target < 0 || index == unprocessed.length) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        processed.add(unprocessed[index]);
        // Take it
        List<List<Integer>> left = helperReturn(processed, unprocessed, index, target - unprocessed[index]);
        result.addAll(left);
        processed.remove(processed.size() - 1);

        // Leave it
        List<List<Integer>> right = helperReturn(processed, unprocessed, index + 1, target);
        result.addAll(right);
        return result;
    }

}
