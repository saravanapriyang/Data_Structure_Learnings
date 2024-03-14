public void dfsearch(int V) {
    boolean[] visited = new boolean[V];
    int[] compID = new int[V];
    int count=0;
    for(int v=0;v<V;v++){
        if(!visited[v]){
            dfsearch(v,visited,compID,count);
            count++;
         }
    }
    System.out.println(count);
}
void dfsearch(int v,boolean[] visited,int[] compID,int count){
    visited[v]=true;
    compID[v]=count;
    for(int w: adj[v]){
        if(!visited[v]){
            dfsearch(w,visited,compID,count);
        }
    }
}
