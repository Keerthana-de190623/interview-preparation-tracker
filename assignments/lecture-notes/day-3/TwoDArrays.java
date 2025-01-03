import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of n : ");
        // int n = sc.nextInt();
        // System.out.println("Enter the value of m : ");
        // int m = sc.nextInt();
        // int[][] nums = new int[n][m];

        // for (int i = 0; i < nums.length; i++) {
        // for (int j = 0; j < nums[i].length; j++) {
        // System.out.println("Enter the value at nums[" + i + "][" + j + "]: ");
        // nums[i][j] = sc.nextInt();
        // }
        // }

        int[] arr = { 1, 2, 3, 4, 5 };
        int[][] nums = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        for (int[] is : nums) {
            System.out.println(Arrays.toString(is));
        }

        sc.close();
    }
}
