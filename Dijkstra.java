public class Dijkstra{

public static void main(String[] args) {  

    // Graph using adjacency matrix  
    int[][] graph = {  
        //0  1  2  3  
        { 0, 1, 4, 0 }, // 0  
        { 1, 0, 2, 6 }, // 1  
        { 4, 2, 0, 3 }, // 2  
        { 0, 6, 3, 0 }  // 3  
    };  

    int n = graph.length;  
    boolean[] visited = new boolean[n];  
    int[] dist = new int[n];  

    // Initialize distances  
    for (int i = 0; i < n; i++) {  
        dist[i] = Integer.MAX_VALUE;  
    }  
    dist[0] = 0;  // Start at node 0  

    // Dijkstra's Algorithm  
    for (int i = 0; i < n - 1; i++) {  

        // Find nearest unvisited node  
        int minNode = -1;  
        for (int j = 0; j < n; j++) {  
            if (!visited[j] && (minNode == -1 || dist[j] < dist[minNode])) {  
                minNode = j;  
            }  
        }  

        visited[minNode] = true;  

        // Update distances  
        for (int j = 0; j < n; j++) {  
            if (graph[minNode][j] != 0 && !visited[j]) {  
                int newDist = dist[minNode] + graph[minNode][j];  
                if (newDist < dist[j]) {  
                    dist[j] = newDist;  
                }  
            }  
        }  
    }  

    // Print final distances  
    System.out.println("Shortest distances from node 0:");  
    for (int i = 0; i < n; i++) {  
        System.out.println("To " + i + " = " + dist[i]);  
    }  
}

}
