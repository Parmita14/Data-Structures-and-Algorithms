import java.util.*;
public class graph2 {
    
        static class Edge{
            int src;
            int dest;
           
            public Edge(int s, int d){
                this.src = s;
                this.dest = d;
               
    
            }
        }

        // CYCLE DETECTION-----------------------------------------------------------------------------------------
            // undirected graph
        
            public static boolean detectCycle(ArrayList<Edge>[] graph){
            boolean vis[] = new boolean[graph.length];
            for(int i=0;i<graph.length;i++){
                if(!vis[i]){
                    if(detectCycleUtil(graph,vis,i,-1)){
                        return true;
                        // cycle exists in part of graph
                    }
                }
            }
            return false;
        }
        public static boolean detectCycleUtil(ArrayList<Edge>[] graph,boolean vis[], int curr,int par){
            vis[curr] = true;
            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                // case 1 --> node not visited
                if(!vis[e.dest]){
                    if(detectCycleUtil(graph, vis, e.dest, curr)){
                        return true;
                    }
                }
                // case 2 --> visit and not parent node
                else if(vis[e.dest] && e.dest != par){
                    return true;
                }
                // case 3 --> do nothing --> continue
            }
            return false;
        }

        // CYCLE DETECTION FOR DIRECTED GRAPH------------------------------------------------------------------------
       
        public static boolean isCycle(ArrayList<Edge>[] graph){
            boolean vis[] = new boolean[graph.length];
            boolean stack[] = new boolean[graph.length];
            for(int i=0;i<graph.length;i++){
                if(!vis[i]){
                    if(isCycleUtil(graph,i,vis,stack)){
                        return true;
                    }
                }
            }
            return false;
        }
        public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean vis[],boolean stack[]){
            vis[curr] = true;
            stack[curr] = true;
            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                if(stack[e.dest]){
                    return true;
                }
                if(!vis[e.dest] && isCycleUtil(graph,e.dest,vis,stack)){
                    return true;
                }
            }
            stack[curr] = false;
            return false;
        }

        // TOPOLOGICAL SORT---------------------------------------------------------------------------------------

        public static void topSort(ArrayList<Edge>[] graph){
            boolean vis[] = new boolean[graph.length];
            Stack<Integer> s = new Stack<>();
            for(int i=0;i<graph.length;i++){
                if(!vis[i]){
                    topSortUtil(graph,i,vis,s); // modified dfs
                }
            }
            while(!s.isEmpty()){
                System.out.println(s.pop() + " ");
            }
        }
        public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean vis[] , Stack<Integer> s){
            vis[curr] = true;
            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                if(!vis[e.dest]){
                    topSortUtil(graph,e.dest,vis,s);
                }
            }
            s.push(curr);
        }

        // BIPARTITE GRAPH----------------------------------------------------------------------------------------
        // COLOURING ALGO ->BFS BASED
        
        public static boolean isBipartite(ArrayList<Edge>[] graph){
            int col[] = new int[graph.length];
            for(int i=0;i<col.length;i++){
                col[i] = -1; // no color
            }
            Queue<Integer> q = new LinkedList<>();

            for(int i=0;i<graph.length;i++){
                if(col[i] == -1){
                    q.add(i);
                    col[i] = 0; // yellow
                    while(!q.isEmpty()){
                        int curr = q.remove();
                        for(int j=0;j<graph[curr].size();j++){
                            Edge e = graph[curr].get(j);
                            if(col[e.dest] == -1){
                                int nextcol = col[curr] == 0? 1:0;
                                col[e.dest] = nextcol;
                                q.add(e.dest);
                            }else if(col[e.dest] == col[curr]){
                                return false; // non bipartite
                            }
                        }
                        
                    }
                }
            }
            return true;
        }
        
        // BFS FOR CONNECTED COMPONENTS---------------------------------------------------------------------------
        
        public static void bfs(ArrayList<Edge>[] graph){
            boolean vis[] = new boolean[graph.length];
            for(int i=0;i<graph.length;i++){
                if(!vis[i]){
                    bfsUtil(graph,vis);
                }
            }
        }
        public static void bfsUtil(ArrayList<Edge>[] graph, boolean vis[]){ // O(V+E)
            Queue<Integer> q = new LinkedList<>();
            
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

        // DFS FOR CONNECTED COMPONENTS-------------------------------------------------------------------------------
       
        public static void dfs(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
        dfsUtil(graph,vis,i);
        }  
    }
        public static void dfsUtil(ArrayList<Edge>[] graph,boolean vis[],int curr){
            // visit
            System.out.print(curr +" ");
            //recursion 
            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                if(!vis[e.dest]){
                    dfsUtil(graph,vis,e.dest);
                }
            }
        }
            // CREATE GRAPH----------------------------------------------------------------------------------------
        static void createGraph(ArrayList<Edge>[] graph){
            for(int i=0;i<graph.length;i++){
                graph[i] = new ArrayList<>();
            }
                // undirected graph is created here
            graph[0].add(new Edge(0,1));
            graph[0].add(new Edge(0,2));
            graph[0].add(new Edge(0,3));

            graph[1].add(new Edge(1,0));
            graph[1].add(new Edge(1,2));

            graph[2].add(new Edge(2,0));
            graph[2].add(new Edge(2,1));

            graph[3].add(new Edge(3,0));
            graph[3].add(new Edge(3,4));

            graph[4].add(new Edge(4,3));

        }
        public static void main(String args[]){
            int v = 5;
            ArrayList<Edge> graph[] = new ArrayList[v];
            createGraph(graph);
            System.out.println(detectCycle(graph));

    }
}
     

