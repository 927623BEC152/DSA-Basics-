import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    public int compareTo(Edge e) {
        return this.weight - e.weight;
    }
}

public class Krushkal {

    static int find(int[] parent, int v) {
        if (parent[v] == v)
            return v;
        return parent[v] = find(parent, parent[v]);
    }

    static void union(int[] parent, int[] rank, int a, int b) {
        int rootA = find(parent, a);
        int rootB = find(parent, b);

        if (rank[rootA] < rank[rootB])
            parent[rootA] = rootB;
        else if (rank[rootA] > rank[rootB])
            parent[rootB] = rootA;
        else {
            parent[rootB] = rootA;
            rank[rootA]++;
        }
    }

    public static void main(String[] args) {
        int V = 4, E = 5;

        Edge[] edges = new Edge[E];

        edges[0] = new Edge(); edges[0].src = 0; edges[0].dest = 1; edges[0].weight = 10;
        edges[1] = new Edge(); edges[1].src = 0; edges[1].dest = 2; edges[1].weight = 6;
        edges[2] = new Edge(); edges[2].src = 0; edges[2].dest = 3; edges[2].weight = 5;
        edges[3] = new Edge(); edges[3].src = 1; edges[3].dest = 3; edges[3].weight = 15;
        edges[4] = new Edge(); edges[4].src = 2; edges[4].dest = 3; edges[4].weight = 4;

        Arrays.sort(edges);

        int[] parent = new int[V];
        int[] rank = new int[V];
        for (int i = 0; i < V; i++) parent[i] = i;

        System.out.println("Kruskal MST:");
        int count = 0;

        for (Edge e : edges) {
            int x = find(parent, e.src);
            int y = find(parent, e.dest);

            if (x != y) {
                System.out.println(e.src + " - " + e.dest + " : " + e.weight);
                union(parent, rank, x, y);
                count++;
                if (count == V - 1) break;
            }
        }
    }
}
