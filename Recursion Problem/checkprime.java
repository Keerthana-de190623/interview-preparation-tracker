public class checkprime {
    public static void main(String[] args) {
        int n=29;
        if(isprime(n,2))
        {
            System.err.println("prime");
        }
        else{
            System.err.println("not a prime");
        }
    }
    public static boolean isprime(int n, int divisor){
        if(divisor*divisor>n){
            return true;
        }
        if(n % divisor == 0){
            return false;
        }
        return isprime(n,divisor+1);
    }
}
//op - prime