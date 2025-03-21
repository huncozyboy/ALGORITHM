import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");

        graph = new ArrayList<>();

        int vn = Integer.parseInt(st.nextToken());
        visited = new boolean[vn + 1];

        for (int i = 0; i <= vn; i++) {
            graph.add(new ArrayList<>());
        }

        int en = Integer.parseInt(st.nextToken());

        for (int i = 0; i < en; i++) {
            String[] nv = br.readLine().split(" ");
            int n1 = Integer.parseInt(nv[0]);
            int n2 = Integer.parseInt(nv[1]);

            graph.get(n1).add(n2);
            graph.get(n2).add(n1);
        }
 

        for (int i = 0; i < graph.size(); i++) {
            Collections.sort(graph.get(i)); 
        }

        int start = Integer.parseInt(st.nextToken());
        dfs(start);
        System.out.println();
        visited = new boolean[vn + 1];
        System.out.println(bfs(start, graph, visited));
    }

    static void dfs(int nodeIndex) {
        visited[nodeIndex] = true;
        System.out.print(nodeIndex + " ");

        for (int node : graph.get(nodeIndex)) {
            if (!visited[node]) {
                dfs(node);
            }
        }
    }

    static String bfs(int start, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {

        StringBuilder sb = new StringBuilder();

        Queue<Integer> q = new LinkedList<Integer>();

        q.offer(start);

        visited[start] = true;

        while (!q.isEmpty()) {
            int nodeIndex = q.poll();
            sb.append(nodeIndex + " ");

            for (int node : graph.get(nodeIndex)) {

                if (!visited[node]) {
                    visited[node] = true;
                    q.offer(node);
                }
            }
        }

        return sb.toString();
    }
}