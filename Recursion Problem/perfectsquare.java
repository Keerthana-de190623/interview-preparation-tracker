public class perfectsquare {
    // public static void main(String[] args) {
    //     int n=10;
    //     if(isperfectsquarenumber(n,1)){
    //         System.err.println(n+" the number is a perfect square");
    //     }
    //     else{
    //         System.out.println(n+" the number is not a perfect square");
    //     }
    // }
    // public static boolean isperfectsquarenumber(int odd,int n) {
    //     if(n==0){
    //         return true;
    //     }
    //     if(n<0)
    //         return false;
    //     return isperfectsquarenumber(n-odd,odd-1);
        
    // }

   
    public int numSquares(int n) {
    int memo[] = new int[n+1];
    return ans(n, memo);
    
}
public int ans(int n, int memo[]){
    if(n<0){
        return Integer.MAX_VALUE;
    }
    if(n==0){
        return 0;
    }
    if(memo[n]>0){
        return memo[n];
    }
    int  min =n;
    for(int i =1; i*i<=n; i++){
        min = Math.min(ans(n-(i*i), memo), min);

    }
    memo[n] = min+1;
    return  min+1;
}
}  