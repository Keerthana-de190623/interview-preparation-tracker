public class Sumofdigitofanumber {
 public static void main(String[] args) {
     int nums=123465;
    int sum=sumofdigit(nums);     
    System.err.println(""+sum);
 }
 public static int sumofdigit(int n) {
    if(n == 0)
        return 0;
 
    return (n%10 + sumofdigit(n/10));
 }
 
}
