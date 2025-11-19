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

    void bfs(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.offer(start);

        while (!q.isEmpty()) {
            int node = q.poll();//remove the value from front of queue
            System.out.print(node + " ");

            for (int x : adj.get(node)) {
                if (!visited[x]) {
                    visited[x] = true;
                    q.offer(x);//add the value at the end of queue
                    
                }
            }
        }
    }
}

public class BFS {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        g.bfs(0);
    }
}