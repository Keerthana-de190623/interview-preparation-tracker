public class RecursiveLinearSearch{
    public static int linearSearch(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index; 
        }
        return linearSearch(arr, target, index + 1); 
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int target = 6;
        System.out.println("Index of target: " + linearSearch(arr, target, 0));
    }

}