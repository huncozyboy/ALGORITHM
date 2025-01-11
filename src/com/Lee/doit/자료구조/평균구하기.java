package com.Lee.doit.자료구조;

import java.util.Scanner;

public class 평균구하기 {
    public double solution(int N, int[] scores) {
        double max = 0;
        double sum = 0;

        for (int score : scores) {
            if (score > max) {
                max = score;
            }
            sum += score;
        }

        return (sum / max * 100) / N;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] scores = new int[N];

        for (int i = 0; i < N; i++) {
            scores[i] = scanner.nextInt();
        }

        평균구하기 sol = new 평균구하기();
        System.out.println(sol.solution(N, scores));
    }
}
