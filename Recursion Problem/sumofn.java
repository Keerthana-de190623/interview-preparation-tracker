public class sumofn {
    public static void main(String[] args) {
        printnumbers(5);
    }
    public static void printnumbers(int n) {
        if(n==0)
            return;
        printnumbers(n-1);
        System.out.println(n);
        /*
        System.err.println(n);
        printnumbers(n-1);
        op
        5
        4
        3
        2
        1
         */

    }
    
}

/*op
1
2
3
4
5
*/

