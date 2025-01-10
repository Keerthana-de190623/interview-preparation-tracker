public class RecursiveBinarySearch {
    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; 
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid; 
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, low, mid - 1); 
        } else {
            return binarySearch(arr, target, mid + 1, high); 
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int target = 8;
        System.out.println("Index of target: " + binarySearch(arr, target, 0, arr.length - 1));
    }
}
