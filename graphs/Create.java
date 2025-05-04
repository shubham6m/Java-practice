import java.util.*;
public class Create {
    static class Edges {
        int src, dest;

        public Edges(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void create(ArrayList<Edges> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // Add edges
        graph[0].add(new Edges(0, 2));
        graph[0].add(new Edges(0, 1));
        graph[1].add(new Edges(1, 0));
        graph[1].add(new Edges(1, 3));
        graph[2].add(new Edges(2, 0));
        graph[2].add(new Edges(2, 4));
        graph[3].add(new Edges(3, 1));
        graph[3].add(new Edges(3, 5));
        graph[4].add(new Edges(4, 2));
        graph[4].add(new Edges(4, 5));
        graph[5].add(new Edges(5, 4));
        graph[5].add(new Edges(5, 3));
    }    
//bfs
    public static void bfs(ArrayList<Edges> graph[]) {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edges e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
//dfs
public static void dfs(ArrayList<Edges> graph[], boolean vis[], int curr){
    //print curr
    System.out.print(curr+" ");
    vis[curr] = true;

    for(int i =0; i<graph[curr].size(); i++){
        Edges e = graph[curr].get(i);
        if(!vis[e.dest]){
            dfs(graph, vis, e.dest);
        }
    }
}
//check bipartite a graph or not
public static boolean isBipartite(ArrayList<Edges> graph[]){
    int col[] = new int[graph.length];
    for(int i=0; i<graph.length; i++){
        col[i] = -1;
    }
    Queue<Integer> q = new LinkedList<>();
    //traverse all graphs 
    for(int i = 0; i<graph.length; i++){
        if(col[i] == -1){
            q.add(i);
            col[i] = 0;//0- yellow
            while(!q.isEmpty()){
                int curr = q.remove();
                for(int j =0; j<graph[curr].size(); j++){
                    Edges e = graph[curr].get(j);
                    if(col[e.dest] == -1){
                        int nextColor = col[curr] == 0 ? 1 : 0;
                        col[e.dest] = nextColor;
                        q.add(e.dest);
                    }else if(col[e.dest] == col[curr]){
                        return false; //not bipartate
                    }
                }
            }
        }
    }
    return true;
}
//topological sort
public static void topSort(ArrayList<Edges> graph[]){
    //create boolean array & visited
    boolean vis[] = new boolean[graph.length];
    Stack<Integer> s = new Stack<>();

    for(int i =0; i<graph.length; i++){
        if(!vis[i]){
            topSortUtil(graph, i, vis, s);
        }

        while(!s.isEmpty()){
            System.out.print(s.peek());
        }
    }
}

//util function
public static void topSortUtil(ArrayList<Edges> graph[], int curr, boolean vis[], Stack<Integer> s){
    vis[curr] = true;
    for(int i = 0; i<graph[curr].size(); i++){
        Edges e = graph[curr].get(i);
        if(!vis[i]){
            topSortUtil(graph, i, vis, s);
        }
    }
    s.push(curr);
}
//all paths from src to dest
public static void path(ArrayList<Edges> graph[], int src, int dest, String path){
    if(src == dest){
        System.out.println(path + dest);
        return;
    }
    for(int i = 0; i<graph[src].size(); i++){
        Edges e = graph[src].get(i);
        path(graph, e.dest, dest, path+src);
    }
}
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edges> graph[] = new ArrayList[v];
        create(graph);
        // bfs(graph);
        // dfs(graph, new boolean[v],0);
        // System.out.println(isBipartite(graph));
        path(graph, 1, 4,"");
    }
}
