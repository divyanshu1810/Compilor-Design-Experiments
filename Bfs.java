import java.util.Iterator;
import java.util.LinkedList;

class Bfs {
    private int V;
    private LinkedList<Integer> adj[]; 

    Bfs(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    void display() {
        for (int i = 0; i < V; ++i) {
            System.out.print("Adjacency list of vertex " + i + ": ");
            for (Integer vertex : adj[i]) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Bfs g = new Bfs(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Adjacency list representation of the graph:");
        g.display();

        System.out.println("\nFollowing is Breadth First Traversal " + "(starting from vertex 2)");
        g.BFS(2);
    }
}
