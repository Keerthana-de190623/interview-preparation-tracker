
public class MaximumNumberOfNiceDivisor {

    public int maxNiceDivisors(int n) {
        if (n <= 3) {
            return n;
        }
        return maxDivisors(n);
    }

    private int maxDivisors(int n) {
        if (n <= 3) {
            return n;
        }

        int mod = 1000000007;
        return switch (n % 3) {
            case 0 -> (int) Math.pow(3, n / 3) % mod;
            case 1 -> (int) (Math.pow(3, (n - 4) / 3) * 4 % mod) % mod;
            default -> (int) (Math.pow(3, (n - 2) / 3) * 2 % mod) % mod;
        };
    }

    public static void main(String[] args) {
        MaximumNumberOfNiceDivisor solution = new MaximumNumberOfNiceDivisor();
        int n = 10;
        System.out.println(solution.maxNiceDivisors(n));  // Output: 36
    }
}
