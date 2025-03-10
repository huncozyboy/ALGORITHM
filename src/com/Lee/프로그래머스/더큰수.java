package com.Lee.프로그래머스;

import java.util.*;

public class 더큰수 {

    public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (stack.isEmpty() || numbers[i] < numbers[i - 1]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                    arr[stack.pop()] = numbers[i];
                }
                stack.push(i);
            }
        }

        while (!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 3, 5};
        더큰수 sol = new 더큰수();

        // 3,5,5,-1
        System.out.println(Arrays.toString(sol.solution(numbers)));
    }


}
