import java.util.Iterator;
import java.util.LinkedList;

/**
 * Time complexity: O(V + E), where V is the number of vertices and E is the number of edges in the graph.
 * Space Complexity: O(V).
 * Since an extra visited array is needed of size V.
 */
public class ClassGraphDFS {


    static class Graph {
        private int V;

        //        Array of list for Adjacency List Representation
        private LinkedList<Integer> adj[];

        // Constructor
        Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                adj[i] = new LinkedList();
            }
        }

        // Methods
        void addEdge(int v, int w) {
            adj[v].add(w);
        }

        // A function used by DFS
        void DFSUtil(int v, boolean visited[]) {
            visited[v] = true;
            System.out.print(v + " ");

            // recur for all the vertices adjacent to this vertex
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n])
                    DFSUtil(n, visited);
            }

        }

        // The function to do DFS traversal. It uses recursive DFSUtil
        void DFS() {
            // Mark all the vertices as not visited
            boolean visited[] = new boolean[V];

            // call the recursive helper function to print DFS traversal starting from all vertices one by one
            for (int i = 0; i < V; i++) {
                if (!visited[i])
                    DFSUtil(i, visited);
            }
        }

        public static void main(String[] args) {
            Graph g = new Graph(4);

            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(1, 2);
            g.addEdge(2, 0);
            g.addEdge(2, 3);
            g.addEdge(3, 3);

            System.out.println("Following is Depth First Traversal ");

            g.DFS();
        }
    }

}
