package com.Lee.doit.시간복잡도;

import java.util.Arrays;
import java.util.Scanner;

public class 수정렬하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] num = new int[N];

        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        for (int n : num) {
            System.out.println(n);
        }

        sc.close();
    }
}
