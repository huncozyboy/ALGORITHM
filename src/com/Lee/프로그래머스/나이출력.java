package com.Lee.프로그래머스;

public class 나이출력 {
    public int solution(int age) {
    int answer = 0;

    answer = 2023 - age;

    return answer;
}

    public static void main(String[] args) {
        나이출력 sol = new 나이출력();
        System.out.println(sol.solution(2001));
    }
}
