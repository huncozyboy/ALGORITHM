import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        // DNA 문자열 S
        String S = br.readLine();

        // 각 문자의 최소 개수
        st = new StringTokenizer(br.readLine());
        int[] minCounts = new int[4];
        for (int i = 0; i < 4; i++) {
            minCounts[i] = Integer.parseInt(st.nextToken());
        }

        // 현재 문자 개수
        int[] currentCounts = new int[4];
        for (int i = 0; i < P; i++) {
            addCount(S.charAt(i), currentCounts);
        }

        // 유효한 비밀번호
        int validCount = 0;
        if (isValid(minCounts, currentCounts)) {
            validCount++;
        }

        // 슬라이딩 윈도우
        for (int i = P; i < length; i++) {

            addCount(S.charAt(i), currentCounts);
            removeCount(S.charAt(i - P), currentCounts);

            if (isValid(minCounts, currentCounts)) {
                validCount++;
            }
        }

        bw.write(String.valueOf(validCount));
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }

    private static void addCount(char c, int[] counts) {
        switch (c) {
            case 'A': counts[0]++; break;
            case 'C': counts[1]++; break;
            case 'G': counts[2]++; break;
            case 'T': counts[3]++; break;
        }
    }

    private static void removeCount(char c, int[] counts) {
        switch (c) {
            case 'A': counts[0]--; break;
            case 'C': counts[1]--; break;
            case 'G': counts[2]--; break;
            case 'T': counts[3]--; break;
        }
    }

    private static boolean isValid(int[] minCounts, int[] currentCounts) {
        for (int i = 0; i < 4; i++) {
            if (currentCounts[i] < minCounts[i]) {
                return false;
            }
        }
        return true;
    }
}