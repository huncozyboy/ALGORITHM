import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 배열의 크기
        int X = Integer.parseInt(st.nextToken()); // X보다 작은 수
        
        // 배열 입력
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        // X보다 작은 수 출력
        for (int i = 0; i < N; i++) {
            if (A[i] < X) {
                bw.write(A[i] + " ");
            }
        }
        
        // 오름차순으로 정렬
        Arrays.sort(A);

        bw.flush();
        bw.close();
        br.close();
    }
}