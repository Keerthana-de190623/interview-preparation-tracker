import java.util.Arrays;

public class MColoringProblem {
    public static void main(String[] args) {
        int V = 4;  
        int[][] graph = {
            {0, 1, 0, 1},
            {1, 0, 1, 1},
            {0, 1, 0, 1},
            {1, 1, 1, 0}
        };
        int m = 3; 
        int[] color = new int[V];
        Arrays.fill(color, -1);
        System.out.println(mColoring(graph, m, color, 0) ? "Solution exists" : "Solution does not exist");
    }

    public static boolean mColoring(int[][] graph, int m, int[] color, int v) {
        if (v == graph.length) {
            return true;
        }

        for (int c = 1; c <= m; c++) {
            if (isSafe(graph, color, v, c)) {
                color[v] = c;
                if (mColoring(graph, m, color, v + 1)) {
                    return true;
                }
                color[v] = -1;  
            }
        }

        return false;
    }

    private static boolean isSafe(int[][] graph, int[] color, int v, int c) {
        for (int i = 0; i < graph.length; i++) {
            if (graph[v][i] == 1 && color[i] == c) {
                return false;
            }
        }
        return true;
    }
}

