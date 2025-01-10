public class numberofstepstoreducenumtozero {
    public static void main(String[] args) {
        numberofstepstoreducenumtozero solution = new numberofstepstoreducenumtozero();
        System.out.println(solution.numberofsteps(10));
    }
    public int numberofsteps(int nums) {
        return helper(nums,0);
    }
    public static int helper(int nums,int steps) {
        if(nums==0){
            return steps;
        }
        if(nums%2 ==0){
            return helper(nums/2,steps+1);
        }
        else{
            return helper(nums-1,steps+1);
        }
    }
}
