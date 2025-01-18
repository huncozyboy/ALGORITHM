package com.Lee.doit.자료구조;
import java.io.*;
import java.util.*;
public class 주몽의명령 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            // 재료들의 고유번호를 입력받음
            int N = Integer.parseInt(br.readLine());
            int M = Integer.parseInt(br.readLine());

            // 입력받은 값들을  N 개의 숫자를 공백 단위로 나누어 배열에 저장
            int[] A = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }

            // 오름차순으로 정렬
            Arrays.sort(A);

            int i = 0; // 맨처음
            int j = N - 1; // 맨끝
            int count = 0; // 결과값

            // i가 j보다 작을 때까지 반복(끝 포인터)
            while (i < j) {
                int sum = A[i] + A[j];

                if (sum == M) { // 두 재료의 합이 목표치와 같은거 찾기
                    count++;
                    i++;
                    j--;
                } else if (sum < M) {
                    i++;
                } else {
                    j--;
                }
            }

            bw.write(count + "\n");

            bw.flush();
            bw.close();
            br.close();
        }
}
