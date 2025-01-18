package com.Lee.doit.자료구조;

import java.io.*;
import java.util.*;
public class 좋은수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // 입력받은 값들을 N 개의 숫자를 공백 단위로 나누어 배열에 저장
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 오름차순으로 정렬
        Arrays.sort(A);

        int G = 0; // 좋은 수 개수

        for (int k = 0; k < N; k++) {
            int target = A[k]; // 기준값
            int i = 0; // 맨처음
            int j = N - 1; // 두번째

            while (i < j) {
                // 첫번째 포인터가 k와 같은 경우는 건너뛰기
                if (i == k) {
                    i++;
                    continue;
                }
                // 두번째 포인터가 k와 같은 경우는 건너뛰기
                if (j == k) {
                    j--;
                    continue;
                }

                int sum = A[i] + A[j];

                if (sum == target) {
                    G++;
                    break; // 더 이상 검사할 필요 없음
                } else if (sum < target) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        bw.write(G + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}