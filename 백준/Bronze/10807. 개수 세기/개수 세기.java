import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // 입력받은 값들을  N 개의 숫자를 공백 단위로 나누어 배열에 저장
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int v = Integer.parseInt(br.readLine());

        // 오름차순으로 정렬
        Arrays.sort(A);

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == v) {
                count++;
            }
        }

        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}