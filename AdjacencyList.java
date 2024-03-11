import java.util.LinkedList;

class Graph{
    LinkedList<Integer> [] adj;

    @SuppressWarnings("unchecked")
    public Graph(int node){
        this.adj = new LinkedList[node];
        for(int i =0;i<node;i++){
            this.adj[i]= new LinkedList<>();

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
    }

}
//output

// Vertex 0:  1 3
// Vertex 1:  0 2
// Vertex 2:  1 3
// Vertex 3:  2 0
