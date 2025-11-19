import java.util.*;

public class Main {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    Main(int v) {
        V = v;
        adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    void printList() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int x : adj.get(i)) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main g = new Main(7);
        g.addEdge(0, 1);
        g.addEdge(0, 3);

        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);

        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.addEdge(2, 6);

        g.addEdge(3, 4);

        
        g.addEdge(4, 5);

        
        g.addEdge(5, 6);


        g.printList();
    }
}