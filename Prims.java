public class Prims {

    public static void main(String[] args) {

        // Simple 4-node graph (already forms MST)
        int[][] graph = {
            { 0, 1, 0, 0 }, // 0
            { 1, 0, 2, 0 }, // 1
            { 0, 2, 0, 3 }, // 2
            { 0, 0, 3, 0 }  // 3
        };

        int n = graph.length;
        boolean[] visited = new boolean[n];
        int[] cost = new int[n];
        int[] parent = new int[n];

        // Initialize
        for (int i = 0; i < n; i++) {
            cost[i] = Integer.MAX_VALUE;
            parent[i] = -1;
        }

        cost[0] = 0; // start at node 0

        // Prim's Algorithm
        for (int i = 0; i < n - 1; i++) {

            // pick smallest unvisited node
            int u = -1;
            for (int j = 0; j < n; j++) {
                if (!visited[j] && (u == -1 || cost[j] < cost[u])) {
                    u = j;
                }
            }

            visited[u] = true;

            // update neighbors
            for (int v = 0; v < n; v++) {
                if (graph[u][v] != 0 && !visited[v] && graph[u][v] < cost[v]) {
                    cost[v] = graph[u][v];
                    parent[v] = u;
                }
            }
        }

        // Print MST
        System.out.println("Edges in MST:");
        int total = 0;
        for (int i = 1; i < n; i++) {
            System.out.println(parent[i] + " - " + i + " : " + cost[i]);
            total += cost[i];
        }

        System.out.println("Total Weight = " + total);
    }
}