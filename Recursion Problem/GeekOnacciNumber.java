public class GeekOnacciNumber {
    public int geekOnacci(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        if (n == 3) return 2;


        return geekOnacci(n - 1) + geekOnacci(n - 2) + geekOnacci(n - 3);
    }
    public static void main(String[] args) {
        GeekOnacciNumber solution = new GeekOnacciNumber();
        System.out.println("GeekOnacci(1): " + solution.geekOnacci(1)); // Output: 0
        System.out.println("GeekOnacci(2): " + solution.geekOnacci(2)); // Output: 1
        System.out.println("GeekOnacci(3): " + solution.geekOnacci(3)); // Output: 2
        System.out.println("GeekOnacci(4): " + solution.geekOnacci(4)); // Output: 3
        System.out.println("GeekOnacci(5): " + solution.geekOnacci(5)); // Output: 6
        System.out.println("GeekOnacci(6): " + solution.geekOnacci(6)); // Output: 11
    }
}
