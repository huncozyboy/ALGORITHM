import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]); 
        int B = Integer.parseInt(input[1]); 

        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            int remainder = N % B;
            if (remainder < 10) {
                sb.append(remainder); 
            } else {
                sb.append((char) ('A' + (remainder - 10))); // 10 이상 문자로 변환
            }
            N /= B;
        }

        bw.write(sb.reverse().toString() + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}