public class checksortarray {
    public static void main(String[]args){
        int[] arr={1,2,3,8};
        int n= arr.length;
        if(checksortedarry(arr,n)){
            System.err.println("Yes");
        }
        else{
            System.err.println("No");
        }
    }
    public static boolean  checksortedarry(int[] arr,int n) {
        if(n ==1|| n==0){
            return true;
        }
        for(int i=1;i<n;i++)
            if(arr[i-1]>arr[i])
                return false;
            
        return true;
    }
}
//op - yes