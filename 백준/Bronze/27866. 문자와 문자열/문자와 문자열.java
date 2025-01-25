import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 번째 줄: 문자열 입력
        String S = br.readLine();

        // 두 번째 줄: i 값 입력
        int i = Integer.parseInt(br.readLine());

        // i번째 문자를 출력
        bw.write(S.charAt(i - 1) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}