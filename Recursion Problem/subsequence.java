
import java.util.ArrayList;
import java.util.List;

public class subsequence {
 static int count=0;
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,};
        subSequence(arr, 0, new ArrayList<>());
        System.err.println(""+count);

    }

    public static void subSequence(int[] nums,int index,List<Integer> current) {
        if(index == nums.length){
            System.err.println(current);
            count++;
            return;

        }
        subSequence(nums, index+1, current);
        current.add(nums[index]);
        subSequence(nums, index+1, current);
        current.remove(current.size()-1);

    }
}