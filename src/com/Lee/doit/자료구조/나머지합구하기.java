package com.Lee.doit.자료구조;

import java.util.Scanner;

public class 나머지합구하기 {
    public long solution(int n, int m, int[] arr) {
        long count = 0;
        long[] remCnt = new long[m];
        long[] sumArr = new long[n + 1];

        // 합 배열
        for (int i = 1; i <= n; i++) {
            sumArr[i] = sumArr[i - 1] + arr[i - 1];
        }

        // 나머지의 개수
        for (int i = 1; i <= n; i++) {
            int rem = (int) (sumArr[i] % m);

            // 음수인 경우 m을 더함
            if (rem < 0) rem += m;

            // 나머지가 0인 경우
            if (rem == 0) count++;

            // 똑같은 나머지
            count += remCnt[rem];

            // 나머지를 기록
            remCnt[rem]++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        나머지합구하기 solver = new 나머지합구하기();
        System.out.println(solver.solution(N, M, arr));

        sc.close();
    }
}
