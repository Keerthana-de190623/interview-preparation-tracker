import java.util.Arrays;

public class HamiltonianCycle {
    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 0, 1, 0},
            {1, 0, 1, 1, 0},
            {0, 1, 0, 1, 1},
            {1, 1, 1, 0, 1},
            {0, 0, 1, 1, 0}
        };
        System.out.println(hasHamiltonianCycle(graph));
    }

    public static boolean hasHamiltonianCycle(int[][] graph) {
        int[] path = new int[graph.length];
        Arrays.fill(path, -1);
        path[0] = 0;  
        return hasHamiltonianCycleUtil(graph, path, 1);
    }

    private static boolean hasHamiltonianCycleUtil(int[][] graph, int[] path, int pos) {
        if (pos == graph.length) {
            return graph[path[pos - 1]][path[0]] == 1;
        }

        for (int v = 1; v < graph.length; v++) {
            if (isSafe(graph, path, pos, v)) {
                path[pos] = v;
                if (hasHamiltonianCycleUtil(graph, path, pos + 1)) {
                    return true;
                }
                path[pos] = -1;
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] graph, int[] path, int pos, int v) {
        return graph[path[pos - 1]][v] == 1 && !contains(path, v, pos);
    }

    private static boolean contains(int[] path, int v, int pos) {
        for (int i = 0; i < pos; i++) {
            if (path[i] == v) {
                return true;
            }
        }
        return false;
    }
}
