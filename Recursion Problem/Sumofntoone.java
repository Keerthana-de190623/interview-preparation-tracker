public class Sumofntoone {

        public static void main(String[] args) {
            printnumbers(5);
        }
        public static void printnumbers(int n) {
            if(n==0)
                return;
            System.out.println(n);
            printnumbers(n-1);
          
             
    
        
        
    }
    
}
/*
 *    op
            5
            4
            3
            2
            1
             
 */