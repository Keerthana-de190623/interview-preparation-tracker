public class BeautifulArrangement {
    public int countArrangement(int n) {
        boolean[] visited = new boolean[n + 1];
        return helper(n, 1, visited);
    }
    private int helper(int n, int pos, boolean[] visited) {
        if (pos > n) return 1;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i] && (i % pos == 0 || pos % i == 0)) {
                visited[i] = true;
                count += helper(n, pos + 1, visited);
                visited[i] = false;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        BeautifulArrangement solution = new BeautifulArrangement();
        System.out.println(solution.countArrangement(2)); // 2
    }
}
