package com.Lee.doit.시간복잡도;

public class 시간복잡도정의하기 {
    public static void main(String[] args) {
        int findNumber = (int)(Math.random() * 100);
        for(int i = 0; i < 100; i++) {
            if(i == findNumber) {
                System.out.println("findNumber: " + findNumber);
                break;
            }
        }
    }
}
