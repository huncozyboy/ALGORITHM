import java.util.Scanner;

public class Main {
    public int solution(int N) {
        int count = 0;
        int start = 1;
        int end = 1;
        int sum = 1;


        while (start <= N && end <= N) {
            if (sum == N) { // N이랑 같으면 가지수 증가 + 끝 포인터를 이동 시킴 + 합에 더함
                count++;
                end++;
                sum += end;
            } else if (sum < N) { // N보다 작으면 끝 포인터 이동 + 힙에 더함
                end++;
                sum += end;
            } else {
                sum -= start;  // N보다 크면 시작 포인터 이동 + 합에서 뺌
                start++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Main solver = new Main();
        System.out.println(solver.solution(N));

        scanner.close();
    }
}
