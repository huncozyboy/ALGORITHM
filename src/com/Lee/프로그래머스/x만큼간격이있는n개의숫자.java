package com.Lee.프로그래머스;

import java.util.ArrayList;
import java.util.List;

public class x만큼간격이있는n개의숫자 {
    static public List<Long> solution(int x, int n) {
        List<Long> answer = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            answer.add((long)x * i);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 5));  // [2, 4, 6, 8, 10]
        System.out.println(solution(4, 3));  // [4, 8, 12]
        System.out.println(solution(-4, 2)); // [-4, -8]
    }
}
