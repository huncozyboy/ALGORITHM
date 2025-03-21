import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static ArrayList<Integer> A[];
    static boolean visited[];
    static boolean arrived;

    void DFS(int now, int level) {
        if (level == 5) {
            arrived = true;
            return;
        }

        visited[now] = true;
        for (int i : A[now]) {
            if (visited[i]) continue;
            DFS(i, level+1);
        }
        
        visited[now] = false;
    }

	void Solve() {
        for (int i=0; i<N; i++) {
            DFS(i, 1);
            if (arrived) break;
        }

        if (arrived)
            System.out.println(1);
        else
            System.out.println(0);
	}

    void inputData() throws Exception {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new ArrayList[N];
        visited = new boolean[N];
        for (int i=0; i<N; i++) {
            A[i] = new ArrayList<Integer>();
        }
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
            
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();
        m.inputData(); 
        m.Solve();
    }
}