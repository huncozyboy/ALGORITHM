package com.Lee.doit.자료구조;

import java.io.*;
import java.util.*;

public class DNA비밀번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        // 두 번째 줄: DNA 문자열 S
        String S = br.readLine();

        // 세 번째 줄: 각 문자의 최소 개수 (A, C, G, T 순서)
        st = new StringTokenizer(br.readLine());
        int[] minCounts = new int[4];
        for (int i = 0; i < 4; i++) {
            minCounts[i] = Integer.parseInt(st.nextToken());
        }

        // 슬라이딩 윈도우를 위한 현재 문자 개수
        int[] currentCounts = new int[4];
        for (int i = 0; i < P; i++) {
            addCount(S.charAt(i), currentCounts);
        }

        // 유효한 비밀번호의 개수
        int validCount = 0;
        if (isValid(minCounts, currentCounts)) {
            validCount++;
        }

        // 슬라이딩 윈도우 방식으로 확인
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

    // 현재 문자 개수를 추가
    private static void addCount(char c, int[] counts) {
        switch (c) {
            case 'A': counts[0]++; break;
            case 'C': counts[1]++; break;
            case 'G': counts[2]++; break;
            case 'T': counts[3]++; break;
        }
    }

    // 현재 문자 개수를 제거
    private static void removeCount(char c, int[] counts) {
        switch (c) {
            case 'A': counts[0]--; break;
            case 'C': counts[1]--; break;
            case 'G': counts[2]--; break;
            case 'T': counts[3]--; break;
        }
    }

    // 현재 상태가 유효한 비밀번호 조건을 만족하는지 확인
    private static boolean isValid(int[] minCounts, int[] currentCounts) {
        for (int i = 0; i < 4; i++) {
            if (currentCounts[i] < minCounts[i]) {
                return false;
            }
        }
        return true;
    }
}
