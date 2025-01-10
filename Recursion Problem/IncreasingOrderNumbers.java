import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderNumbers {
    public List<Integer> findNumbers(int n) {
        List<Integer> result = new ArrayList<>();
        generateNumbers(n, 1, 0, result);
        return result;
    }

    private void generateNumbers(int n, int start, int current, List<Integer> result) {
        if (n == 0) {
            result.add(current);
            return;
        }
        for (int i = start; i <= 9; i++) {
            generateNumbers(n - 1, i + 1, current * 10 + i, result);
        }
    }
}

