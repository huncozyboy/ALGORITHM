import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        int left = 0;
        int right = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            right += arr[i];
            if (left < arr[i]) {
                left = arr[i];
            }
        }

        while (left <= right) {
            int mid = (left + right) / 2;
            int sum = 0;
            int cnt = 0; //블루레이 개수

            for (int i = 0; i < N; i++) {
                if (sum + arr[i] > mid) {
                    sum = 0; // 합 초기화
                    cnt++;
                }
                sum += arr[i];
            }

            if (sum != 0) {
                cnt++;
            }

            if (cnt <= M) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);
    }
}
