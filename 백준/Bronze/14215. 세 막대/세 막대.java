import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] sticks = new int[3];
        for (int i = 0; i < 3; i++) {
            sticks[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        Arrays.sort(sticks);
        int a = sticks[0], b = sticks[1], c = sticks[2];

        while (c >= a + b) {
            c--; // 가장 긴 변을 줄이면서 삼각형 최대 둘레 찾기
        }

        System.out.println(a + b + c);
    }
}