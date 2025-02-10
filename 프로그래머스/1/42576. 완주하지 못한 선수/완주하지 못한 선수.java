import java.util.Arrays;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant); // 오름차순 > 이름의 순서를 같게 하고 비교하면 쉬움
        Arrays.sort(completion);

        // 더 작은 배열인 completion을 for문으로 돌려야 편함
        for (int i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                return participant[i];
            }
        }

        answer = participant[participant.length - 1];
        // 이 경우는 Participant의 마지막 선수일 경우

        return answer;
    }

    public static void main(String[] args) {

    }

}