package com.Lee.프로그래머스;

public class 두정수사이의합 {
    public long solution(int a, int b) {
    long answer = 0;

    if (a > b) {
        int temp = b;
        b = a;
        a = temp;
    }

    for (int i = a; i <= b; i++) {
        answer += i;
    }

    return answer;
    }

    public static void main(String[] args) {
        두정수사이의합 sol = new 두정수사이의합();
        System.out.println(sol.solution(3, 5)); // 12
    }
}
