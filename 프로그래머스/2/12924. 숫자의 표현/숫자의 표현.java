import java.util.List;

public class Solution {

    public boolean success(int pos, int n) {
        int sum = 0;
        for(int i=pos; i<=n; i++) {
            sum += i;
            if(sum == n) {
                return true;
            } else if(sum > n) {
                return false;
            }
        }
        return false;
    }


    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++) {
            if(success(i, n)) {
                answer ++;
                continue;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(15)); // 4
    }
}