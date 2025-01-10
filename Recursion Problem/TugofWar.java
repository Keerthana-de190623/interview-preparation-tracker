
import java.util.ArrayList;
import java.util.List;

public class TugofWar {

    static int minDifference = Integer.MAX_VALUE;
    static List<Integer> bestSubset1 = new ArrayList<>();
    static List<Integer> bestSubset2 = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, -3, 100, 1, 89, 54, 23, 20};
        findTugOfWar(arr);
        System.out.println("Subset 1: " + bestSubset1);
        System.out.println("Subset 2: " + bestSubset2);
        System.out.println("Minimum Difference: " + minDifference);
    }

    public static void findTugOfWar(int[] arr) {
        List<Integer> subset1 = new ArrayList<>();
        List<Integer> subset2 = new ArrayList<>();
        tugOfWarHelper(arr, 0, subset1, subset2, 0, 0);
    }

    private static void tugOfWarHelper(int[] arr, int index, List<Integer> subset1, List<Integer> subset2, int sum1, int sum2) {

        if (index == arr.length) {

            if (Math.abs(subset1.size() - subset2.size()) <= 1) {
                int difference = Math.abs(sum1 - sum2);
                if (difference < minDifference) {

                    minDifference = difference;
                    bestSubset1 = new ArrayList<>(subset1);
                    bestSubset2 = new ArrayList<>(subset2);
                }
            }
            return;
        }

        subset1.add(arr[index]);
        tugOfWarHelper(arr, index + 1, subset1, subset2, sum1 + arr[index], sum2);
        subset1.remove(subset1.size() - 1);

        subset2.add(arr[index]);
        tugOfWarHelper(arr, index + 1, subset1, subset2, sum1, sum2 + arr[index]);
        subset2.remove(subset2.size() - 1);
    }
}
