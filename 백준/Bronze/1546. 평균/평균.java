import java.util.Scanner;

public class Main {
    public double solution(int N, int[] scores) {
        double max = 0;
        double sum = 0;

        for (int score : scores) {
            if (score > max) {
                max = score;
            }
            sum += score;
        }

        return (sum / max * 100) / N;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] scores = new int[N];

        for (int i = 0; i < N; i++) {
            scores[i] = scanner.nextInt();
        }

        Main sol = new Main();
        System.out.println(sol.solution(N, scores));
    }
}
