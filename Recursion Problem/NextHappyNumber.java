
public class NextHappyNumber {

    static int nextHappy(int N) {
        if (isHappy(N + 1)) {
            return N + 1;
        }
        return nextHappy(N + 1);
    }

    public static boolean isHappy(int N) {
        if (N == 1) {
            return true;
        }
        if (N == 4) {
            return false;
        }

        int sum = sumOfSquares(N);
        return isHappy(sum);
    }

    public static int sumOfSquares(int N) {
        if (N == 0) {
            return 0;
        }
        int digit = N % 10;
        return digit * digit + sumOfSquares(N / 10);
    }

    public static void main(String[] args) {
        int N = 19;
        System.out.println("Next happy number after " + N + " is: " + nextHappy(N));
    }
}
