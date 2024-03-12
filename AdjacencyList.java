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
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);

        g.display();
        g.BFS(0, 4);
        System.out.println("");
        g.Dfs(0, 4);
    }

}
