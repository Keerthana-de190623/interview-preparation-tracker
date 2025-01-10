public class powerofthree {
        public static void main(String[] args) {
            int n=81;
            if(ispowerofthree(n)){
                System.err.println("power of three");
            }
            else{
                System.err.println("not a power of three");
            }
        }
        public static boolean ispowerofthree(int n) {
            if(n==1){
                return true;
            }
            if(n<=0 || n%3 !=0){
                return false;
            }
            return ispowerofthree(n/3);
        }
    }
    
