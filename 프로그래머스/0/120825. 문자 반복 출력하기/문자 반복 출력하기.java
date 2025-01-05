import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    static public String solution(String my_string, int n) {
        String answer = "";

        answer = Arrays.stream(my_string.split(""))
                .map(i -> i.repeat(n))
                .collect(Collectors.joining());

        return answer;
    }
}