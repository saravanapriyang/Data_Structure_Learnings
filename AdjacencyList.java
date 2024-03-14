import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
class Graph{
    LinkedList<Integer> [] adj;

    @SuppressWarnings("unchecked")
    public Graph(int node){
        this.adj = new LinkedList[node];
        for(int i =0;i<node;i++){
            this.adj[i]= new LinkedList<>();

        }     
    }
    
    public void BFS(int s, int vertex) {
        boolean[] visited = new boolean[vertex];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.println(u + "");
            for (int v : adj[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
    }

    public void Dfs(int s, int vertex) {
        boolean[] visited = new boolean[vertex];
        Stack<Integer> Stack = new Stack<>();
        Stack.push(s);
        while (!Stack.isEmpty()) {
            int u = Stack.pop();
            if (!visited[u]) {
                visited[u] = true;
                System.out.println(u + " ");
                for (int v : adj[u]) {
                    if (!visited[v]) {
                        Stack.push(v);
                    }
                }
            }
        }

    }

    public void dfsearch(int V) {
        boolean[] visited = new boolean[V];
        int[] compID = new int[V];
        int count = 0;
        for (int v = 0; v < V; v++) {
            if (!visited[v]) {
                dfsearch(v, visited, compID, count);
                count++;
            }
        }
        System.out.println(count);
    }

    void dfsearch(int v, boolean[] visited, int[] compID, int count) {
        visited[v] = true;
        compID[v] = count;
        for (int w : adj[v]) {
            if (!visited[v]) {
                dfsearch(w, visited, compID, count);
            }
        }
    }


    public void addEdge(int u, int v){   
        adj[u].add(v);       
        adj[v].add(u);
    }
    void display(){
        for(int i =0;i<4;i++){
            System.out.print("Vertex " + i + ": ");
            for(Integer edge : adj[i]){
                System.out.print(" " + edge);
            }
            System.out.println();
        }
    }
}

public class AdjacencyList {
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(3, 4);

        graph.dfsearch(6);
    }

}
//output

// Vertex 0:  1 3
// Vertex 1:  0 2
// Vertex 2:  1 3
// Vertex 3:  2 0
