
public class MaxNumberBySwaps {

    public static void main(String[] args) {
        String number = "2736";
        int k = 1;

        System.out.println(maximumSwap(number, k));  // Output: 7236
    }

    public static String maximumSwap(String num, int k) {
        char[] numArr = num.toCharArray();
        String result = num;
        result = solveMaxNumber(numArr, k, 0, result);
        return result;
    }

    private static String solveMaxNumber(char[] numArr, int k, int index, String result) {

        if (k == 0 || index == numArr.length) {
            return new String(numArr);
        }

        for (int i = index + 1; i < numArr.length; i++) {
            if (numArr[i] > numArr[index]) {

                swap(numArr, i, index);
                String newResult = new String(numArr);

                result = max(result, solveMaxNumber(numArr, k - 1, index + 1, newResult));

                swap(numArr, i, index);
            }
        }
        return result;
    }

    private static void swap(char[] numArr, int i, int j) {
        char temp = numArr[i];
        numArr[i] = numArr[j];
        numArr[j] = temp;
    }

    private static String max(String a, String b) {
        return a.compareTo(b) > 0 ? a : b;
    }
}
