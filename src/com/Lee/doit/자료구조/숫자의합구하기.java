package com.Lee.doit.자료구조;

import java.util.Scanner;

public class 숫자의합구하기 {
    public int solution(int N, String numbers) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += numbers.charAt(i) - '0';
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        String num = scanner.nextLine();

        숫자의합구하기 sol = new 숫자의합구하기();
        System.out.println(sol.solution(N, num));
    }
}
