import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); 

        int[] coins = {25, 10, 5, 1};

        // 테스트 케이스마다 실행
        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine()); 
            StringBuilder sb = new StringBuilder();

            for (int coin : coins) {
                sb.append(C / coin).append(" ");
                C %= coin; // 남은 금액 갱신
            }

            bw.write(sb.toString().trim() + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}