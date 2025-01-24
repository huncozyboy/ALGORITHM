import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    static public List<Integer> solution(int[] numbers) {
        return Arrays.stream(numbers)
                .mapToObj(i -> i * 2)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}));
    }
}