import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        
        // 알파벳 위치저장 배열
        int[] positions = new int[26];
        for (int i = 0; i < positions.length; i++) {
            positions[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int index = c - 'a'; // 알파벳의 인덱스 계산
            if (positions[index] == -1) { // 맨처음은 위치 저장
                positions[index] = i;
            }
        }
        
        for (int i = 0; i < positions.length; i++) {
            bw.write(positions[i] + " ");
        }
        bw.newLine();
        bw.flush();

        br.close();
        bw.close();
    }
}