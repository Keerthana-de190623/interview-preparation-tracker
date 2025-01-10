
import java.util.Arrays;

public class sumoftriangle {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        sumoftriangles(a);
    }
    public static void sumoftriangles(int[] nums) {
        if(nums.length<1)
            return;
        int[] arr = new int [nums.length-1];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]+nums[i+1];
        }
        sumoftriangles(arr);
        System.err.println(Arrays.toString(nums));
    }
}
