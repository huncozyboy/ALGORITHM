package com.Lee.단계별로풀기;

import java.io.*;

public class 문자와문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Test = Integer.parseInt(br.readLine());

        for (int t = 0; t < Test; t++) {
            // 반복 횟수와 문자열 입력
            String[] input = br.readLine().split(" ");
            int R = Integer.parseInt(input[0]);
            String S = input[1];

            // 결과 문자열 생성
            StringBuilder result = new StringBuilder();
            for (char c : S.toCharArray()) {
                for (int i = 0; i < R; i++) {
                    result.append(c); // 문자를 R번 추가
                }
            }

            // 출력 결과 작성
            bw.write(result.toString());
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}