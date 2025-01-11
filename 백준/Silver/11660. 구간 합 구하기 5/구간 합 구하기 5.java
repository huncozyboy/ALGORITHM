import java.util.Scanner;

public class Main {
    // 구간 합 계산 로직
    public void solution() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] table = new int[N + 1][N + 1];
        int[][] prefixSum = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {

                // 표
                table[i][j] = scanner.nextInt();


                prefixSum[i][j] = table[i][j]
                        + prefixSum[i - 1][j] // 위쪽
                        + prefixSum[i][j - 1] // 왼쪽
                        - prefixSum[i - 1][j - 1]; // 중복 빼기
            }
        }

        StringBuilder result = new StringBuilder();
        for (int query = 0; query < M; query++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            int regionSum = prefixSum[x2][y2]
                    - prefixSum[x1 - 1][y2] // 위쪽 빼기
                    - prefixSum[x2][y1 - 1] // 왼쪽 빼기
                    + prefixSum[x1 - 1][y1 - 1]; // 중복 더하기

            result.append(regionSum).append("\n");
        }

        System.out.print(result);
        scanner.close();
    }

    public static void main(String[] args) {
        Main solver = new Main();
        solver.solution();
    }
}
