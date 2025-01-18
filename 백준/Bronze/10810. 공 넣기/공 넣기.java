import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 2개의 숫자를 입력받음
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 재료의 개수
        int M = Integer.parseInt(st.nextToken()); // 목표치

        int[] baskets = new int[N];

        for (int t = 0; t < M; t++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            // i번 바구니부터 j번 바구니까지 k번 공을 넣음
            for (int idx = i - 1; idx < j; idx++) {
                baskets[idx] = k;
            }
        }

        // 결과 출력
        for (int basket : baskets) {
            bw.write(basket + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}