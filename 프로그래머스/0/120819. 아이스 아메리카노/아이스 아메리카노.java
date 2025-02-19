import java.util.*;

public class Solution {
    static public List<Integer> solution(int money) {
        List<Integer> answer = new ArrayList<>();

        answer.add(money / 5500);
        answer.add(money - answer.get(0) * 5500);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(15000)); // 2, 4000
    }
}