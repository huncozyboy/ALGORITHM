import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 번째 줄: 문자열 입력
        String S = br.readLine();

        // 문자열의 길이 출력
        bw.write(S.length() + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}