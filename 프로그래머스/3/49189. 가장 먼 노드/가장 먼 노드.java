import java.util.*;

public class Solution {

    static ArrayList<Integer>[] list;
    static int[] visited;
    static int max = 0;

    public int solution(int n, int[][] edge) {
        initData(n, edge);
        return getAnswer();
    }

    private void initData(int n, int[][] edge) {
        list = new ArrayList[n + 1];
        visited = new int[n + 1];
        max = 0;

        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        for (int[] arr : edge) {
            int node1 = arr[0];
            int node2 = arr[1];

            list[node1].add(node2);
            list[node2].add(node1);
        }
    }

    private int getAnswer() {
        int answer = 0;
        bfs(1, 1);

        for (int i : visited) {
            if (i == max) {
                answer++;
            }
        }
        return answer;
    }

    private void bfs(int start, int count) {
        Queue<Integer> q = new LinkedList();
        q.add(start);
        q.add(count);
        visited[start] = count;

        while (!q.isEmpty()) {
            int node = q.poll();
            int n = q.poll();

            if (max < n) {
                max = n;
            }

            for (int i = 0; i < list[node].size(); i++) {
                int next = list[node].get(i);

                if (visited[next] != 0) {
                    continue;
                }

                visited[next] = n + 1;
                q.add(next);
                q.add(n + 1);
            }
        }
    }
    
}