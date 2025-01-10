public class productofnnumber {
    public static void main(String[] args) {
        int n=5;
        System.out.println(productofnumber(n));
    }
    public static int productofnumber(int n) {
        int product=1;
        for(int i=1;i<=n;i++){
            product*=i;
        }
        return product;
    }
}
