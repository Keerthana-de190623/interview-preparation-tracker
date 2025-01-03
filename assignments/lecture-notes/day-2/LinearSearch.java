
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 4, 3, 7, 545, 54, 34, 24 };
        int target = 545;
        System.out.println(linearSearch(arr, target));
    }
}