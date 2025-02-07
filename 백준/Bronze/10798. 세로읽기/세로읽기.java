import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] grid = new char[5][15];

        for (int row = 0; row < 5; row++) {
            String line = br.readLine();
            for (int col = 0; col < line.length(); col++) {
                grid[row][col] = line.charAt(col);
            }
        }

        for (int col = 0; col < 15; col++) {
            for (int row = 0; row < 5; row++) {
                if (grid[row][col] != 0) { // 빈 문자 제외
                    bw.write(grid[row][col]);
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}