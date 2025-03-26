import java.util.*;

public class Solution {
    static public int solution(int order) {
        return (int) Arrays.stream(String.valueOf(order).split(""))
                .filter("369"::contains)
                .count();
    }

    public static void main(String[] args) {
        System.out.println(solution(356)); // 2
    }
}