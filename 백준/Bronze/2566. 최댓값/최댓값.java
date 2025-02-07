import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[][] grid = new int[9][9]; // 9x9 격자
        int maxValue = Integer.MIN_VALUE; // 최댓값 저장 변수
        int maxRow = 0, maxCol = 0; // 최댓값 위치

        for (int row = 0; row < 9; row++) {
            String[] values = reader.readLine().split(" ");
            for (int col = 0; col < 9; col++) {
                grid[row][col] = Integer.parseInt(values[col]);

                if (grid[row][col] > maxValue) { // 최대값
                    maxValue = grid[row][col];
                    maxRow = row + 1; 
                    maxCol = col + 1; 
                }
            }
        }

        System.out.println(maxValue);
        System.out.println(maxRow + " " + maxCol);

        reader.close();
    }
}