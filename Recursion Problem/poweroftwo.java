public class poweroftwo {
    public static void main(String[] args) {
        int n=16;
        if(ispoweroftwo(n)){
            System.err.println("power of two");
        }
        else{
            System.err.println("not a power of two");
        }
    }
    public static boolean ispoweroftwo(int n) {
        if(n == 1){
            return true;
        }
        if(n<=0 || n%2 !=0){
            return false;
        }
        return ispoweroftwo(n/2);
    }
}
