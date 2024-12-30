package com.Lee.프로그래머스;

import java.util.Arrays;

public class A로B만들기 {
    public static int solution(String before, String after) {
        int answer = 1;

        // 문자 배열 변환 후 정렬
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        // 정렬된 배열 비교
        for (int i = 0; i < beforeArr.length; i++) {
            if (beforeArr[i] != afterArr[i]) {
                answer = 0;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("olleh", "hello"));
        System.out.println(solution("abc", "cba"));
        System.out.println(solution("abc", "def"));
        System.out.println(solution("abc#", "#abc"));
        System.out.println(solution("abc ", "abc"));
    }
}