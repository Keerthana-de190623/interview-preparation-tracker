public class poweroffour {
    public static void main(String[] args) {
        int n=81;
        if(ispoweroffour(n)){
            System.err.println("power of four");
        }
        else{
            System.err.println("not a power of four");
        }
    }
    public static boolean ispoweroffour(int n) {
        if(n==1){
            return true;
        }
        if(n<=0 || n%4 !=0){
            return false;
        }
        return ispoweroffour(n/4);
    }
}
