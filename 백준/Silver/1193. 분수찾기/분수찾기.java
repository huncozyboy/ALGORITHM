import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(br.readLine());
        
        int count = 1, diagonal = 1; 
        while (count + diagonal <= x) {
            count += diagonal;
            diagonal++;
        }

        int up, down;
        int offset = x - count;

        if (diagonal % 2 == 0) {
            up = 1 + offset;
            down = diagonal - offset;
        } else { 
            up = diagonal - offset;
            down = 1 + offset;
        }

        sb.append(up).append("/").append(down);
        System.out.println(sb);
    }
}