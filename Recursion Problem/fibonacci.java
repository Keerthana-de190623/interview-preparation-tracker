public class fibonacci {
    public static void main(String[] args) {
        int n=5;
        System.err.println(fibonaccis(n));
    }
    public static int fibonaccis(int n) {
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        if(n<=1)
            return n;
        return fibonaccis(n-1)+fibonaccis(n-2);
    }
}
//output=3
