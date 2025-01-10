public class sofn {
        public static void main(String[] args) {
        int n=5;
        System.err.println(Sumofnums(n));
        }
        public static int Sumofnums(int n) {
            int sum=0;
            for (int i = 0; i <=n; i++) {
                sum+=i;
            }
        
            return sum;
        }
    }
