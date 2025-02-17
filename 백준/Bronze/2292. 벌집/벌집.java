import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println(1);
            return;
        }

        int layer = 1; 
        int range = 2; 

        while (range <= N) {
            range += 6 * layer; // 다음 층 범위 +
            layer++;
        }

        System.out.println(layer);
    }
}