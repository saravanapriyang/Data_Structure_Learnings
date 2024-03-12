import java.util.Stack;
import java.util.LinkedList;

class Graph {
    LinkedList<Integer>[] adj;

    @SuppressWarnings("unchecked")
    public Graph(int node) {
        this.adj = new LinkedList[node];
        for (int i = 0; i < node; i++) {
            this.adj[i] = new LinkedList<>();

        }
    }
public void Dfs(int s,int vertex) {
    boolean[] visited = new boolean[vertex];
    Stack<Integer> Stack = new Stack<>();
    Stack.push(s);
    while(!Stack.isEmpty()){
        int u = Stack.pop();
        if(!visited[u]){
            visited[u]= true;
            System.out.println(u+" ");
            for(int v: adj[u]){
            if(!visited[v]){
                Stack.push(v);
            }
            }
        }
    }

}

public void addEdge(int u, int v) {
    adj[u].add(v);
    adj[v].add(u);
}

void display() {
    for (int i = 0; i < 4; i++) {
        System.out.print("Vertex " + i + ": ");
        for (Integer edge : adj[i]) {
            System.out.print(" " + edge);
        }
        System.out.println();
    }
}
}

public class Dfs {
public static void main(String[] args) {
    Graph g = new Graph(4);
    g.addEdge(0, 1);
    g.addEdge(1, 2);
    g.addEdge(2, 3);
    g.addEdge(3, 0);

    g.display();
    System.out.println("");
    g.Dfs(0, 4);
}

}
