import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 줄 입력: N(바구니 개수), M(작업 수)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 바구니 개수
        int M = Integer.parseInt(st.nextToken()); // 작업 수

        // 초기 바구니 상태 설정
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1; // 바구니는 1부터 N까지 번호가 매겨져 있음
        }

        // M개의 작업 처리
        for (int t = 0; t < M; t++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()); // 시작 바구니
            int j = Integer.parseInt(st.nextToken()); // 끝 바구니

            // i부터 j까지의 바구니 순서를 뒤집음
            reverse(baskets, i - 1, j - 1);
        }

        // 결과 출력
        for (int basket : baskets) {
            bw.write(basket + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}