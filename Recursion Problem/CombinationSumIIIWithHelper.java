
import java.util.ArrayList;
import java.util.List;

public class CombinationSumIIIWithHelper {

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        helper(k, n, 1, new ArrayList<>(), result);
        return result;
    }

    private static void helper(int k, int target, int start, List<Integer> combination, List<List<Integer>> result) {
        if (k == 0 && target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        if (k == 0 || target < 0) {
            return;
        }

        for (int i = start; i <= 9; i++) {
            combination.add(i);
            helper(k - 1, target - i, i + 1, combination, result);
            combination.remove(combination.size() - 1);
        }
    }

    public static void main(String[] args) {
        int k = 3, n = 7;
        System.out.println(combinationSum3(k, n));
    }
}
