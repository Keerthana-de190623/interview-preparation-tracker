public class sumofnnumber{
public static void main(String[] args) {

        int n=5;
        System.err.println(Sumofnums(n));
        }
        public static int Sumofnums(int n) {
            if(n==0)
                return 0;
         
            return n+Sumofnums(n-1);
        }
    }

