import java.util.Arrays;

public class DijkstraAlgorithm {
    private static final int INF = Integer.MAX_VALUE; 
    public static void dijkstra(int[][] graph, int source) {
        int V = graph.length;
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];
        Arrays.fill(dist, INF);
        Arrays.fill(visited, false);
        dist[source] = 0;
        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, visited);
            visited[u] = true;
            for (int v = 0; v < V; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != INF && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        printSolution(dist);
    }
    private static int minDistance(int[] dist, boolean[] visited) {
        int min = INF, minIndex = -1;
        for (int v = 0; v < dist.length; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
    private static void printSolution(int[] dist) {
        System.out.println("Vertex \t\t Distance from Source");
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
                { 0, 4, 0, 0},
                { 4, 0, 8, 1},
                { 0, 8, 0, 7},
                { 0, 0, 7, 0}
                
        };
        int source = 0;
        dijkstra(graph, source);
    }
}
