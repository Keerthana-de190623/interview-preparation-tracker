import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget {
    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);
        graph.get(3).add(4);

        int target = 4;
        List<List<Integer>> result = allPaths(graph, 0, target);
        System.out.println("All paths from source to target:");
        for (List<Integer> path : result) {
            System.out.println(path);
        }
    }

    public static List<List<Integer>> allPaths(List<List<Integer>> graph, int source, int target) {
        List<List<Integer>> paths = new ArrayList<>();
        findPaths(graph, source, target, new ArrayList<>(), paths);
        return paths;
    }

    private static void findPaths(List<List<Integer>> graph, int currentNode, int target, List<Integer> currentPath, List<List<Integer>> paths) {
 
        currentPath.add(currentNode);

        if (currentNode == target) {
            paths.add(new ArrayList<>(currentPath));
        } else {

            for (int neighbor : graph.get(currentNode)) {

                if (!currentPath.contains(neighbor)) {
                    findPaths(graph, neighbor, target, currentPath, paths);
                }
            }
        }
        currentPath.remove(currentPath.size() - 1);
    }
}
