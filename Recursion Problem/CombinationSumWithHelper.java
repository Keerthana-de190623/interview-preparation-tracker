
import java.util.ArrayList;
import java.util.List;

public class CombinationSumWithHelper {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void helper(int[] candidates, int target, int index, List<Integer> combination, List<List<Integer>> result) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            combination.add(candidates[i]);
            helper(candidates, target - candidates[i], i, combination, result);
            combination.remove(combination.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }
}
