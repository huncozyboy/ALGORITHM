import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coinArray = new int[n];

        for (int i = 0; i < n; i++) {
            coinArray[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (k >= coinArray[i]) {
                int used = k / coinArray[i];
                count += used;
                k -= used * coinArray[i];
            }
            if (k == 0) break;
        }

        System.out.println(count);
    }
}