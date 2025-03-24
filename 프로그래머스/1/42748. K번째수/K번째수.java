import java.util.*;

public class Solution {
    static public List<Integer> solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                temp.add(array[j]);
            }
            Collections.sort(temp);
            answer.add(temp.get(commands[i][2] - 1));
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(solution(array, commands));
    }
}