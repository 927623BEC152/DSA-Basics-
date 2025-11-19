import java.util.*;

class Graph {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    Graph(int v) {
        V = v;
        adj = new ArrayList<>();
        for (int i = 0; i < v; i++) adj.add(new ArrayList<>());
    }

    void addEdge(int a, int b) {
        adj.get(a).add(b);
        adj.get(b).add(a);
    }

    void dfsUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int i = 0; i < adj.get(node).size(); i++) {
    int x = adj.get(node).get(i);   // neighbor
    if (!visited[x]) {
        dfsUtil(x, visited);
    }
}
    }

    void dfs(int start) {
        boolean[] visited = new boolean[V];
        dfsUtil(start, visited);
    }
}

public class DPTs {
    public static void main(String[] args) {
        Graph g = new Graph(8);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(3, 5);
        g.addEdge(3, 6);
        g.addEdge(6, 7);

        g.dfs(0);  
    }
}