public class CircularGameWinner {
    public int findTheWinner(int n, int k) {
        return findTheWinnerHelper(n, k, 0);
    }

    private int findTheWinnerHelper(int n, int k, int start) {
        if (n == 1) return start;  
        int next = (start + k) % n;  
        return findTheWinnerHelper(n - 1, k, next); 
    }

    public static void main(String[] args) {
        CircularGameWinner solution = new CircularGameWinner();
        System.out.println(solution.findTheWinner(5, 2));  
    }
}

