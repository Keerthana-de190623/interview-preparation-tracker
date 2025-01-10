public class factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorials(n));
    }
    public static int factorials(int n ) {
        if(n==0)
            return 1;
         return n * factorials(n-1);
    }
}
