
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumIIWithHelper {

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        System.out.println(combinationSum2(candidates, target));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            combination.add(candidates[i]);
            helper(candidates, target - candidates[i], i + 1, combination, result);
            combination.remove(combination.size() - 1);
        }
    }
}
