
import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr, int start, int n) {
        if (start == n - 1) {
            return;
        }

        int minIndex = start;
        for (int i = start + 1; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        int temp = arr[start];
        arr[start] = arr[minIndex];
        arr[minIndex] = temp;

        selectionSort(arr, start + 1, n);
    }

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        selectionSort(arr, 0, arr.length);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
