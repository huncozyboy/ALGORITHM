import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫번째 줄: 테스트 케이스의 수 입력
        int Num = Integer.parseInt(br.readLine());

        for (int test = 0; test < Num; test++) {

            String str = br.readLine();

            // 첫 문자와 마지막 문자 가져오기
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);

            // 출력 형식에 맞게 쓰기
            bw.write(firstChar + "" + lastChar + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}