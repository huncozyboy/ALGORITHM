import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {static public List<Integer> solution(String my_string) {
    return Arrays.stream(my_string.split(""))
            .filter(i -> Character.isDigit(i.charAt(0)))
            .map(i -> Integer.parseInt(i))
            .sorted()
            .collect(Collectors.toList());
}
}