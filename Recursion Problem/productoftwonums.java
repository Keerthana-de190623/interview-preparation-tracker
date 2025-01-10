public class productoftwonums {
    public static void main(String[] args) {
        int n=2;
        int m=9;
        System.out.println(productofnumbers(n,m));
    }
    public static int productofnumbers(int n,int m) {
        if(m==0)
            return 0;
     
    return n+productofnumbers(n,m-1);
    }
}
