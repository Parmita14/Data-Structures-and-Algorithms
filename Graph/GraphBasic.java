import java.util.*;
public class graphBasic {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;

        }
    }
    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.print(curr +" ");
                vis[curr] = true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge>[] graph,boolean vis[],int curr){
        // visit
        System.out.print(curr +" ");
        //recursion 
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,vis,e.dest);
            }
        }
    }
    public static boolean HasPath(ArrayList<Edge>[] graph,boolean vis[], int src,int dest){
        if(src == dest){
            return true;
        }
        vis[src] = true;
        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            if(!vis[e.dest] && HasPath(graph, vis,e.dest, dest)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int v=7;
        
        ArrayList<Edge>[] graph = new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i] = new ArrayList<>();
        }
        boolean vis[] = new boolean[7];
        // 0th vertex
        graph[0].add(new Edge(0,1,5));
        graph[0].add(new Edge(0,2,5));

        // 1th vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 3, 3));
        // 2nd vertex
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 4));
        // 3rd vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3,5,5));
        // 4th vertex
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4,3,5));
        graph[4].add(new Edge(4,5,5));
        // 5th vertex
        graph[5].add(new Edge(5,3,5));
        graph[5].add(new Edge(5,4,5));
        graph[5].add(new Edge(5,6,5));
        // 6th vertex
        graph[6].add(new Edge(6,5,5));
        // to find neighbours to 2
        // for(int i=0;i<graph[2].size();i++){
        //     Edge e = graph[2].get(i); // src,dest,wt
        //     System.out.print(e.dest + " ");
        // }
        // bfs(graph);
        // System.out.println();
        // dfs(graph,vis,0);
        // System.out.println();
        HasPath(graph, vis, 0, 5);
    }
}