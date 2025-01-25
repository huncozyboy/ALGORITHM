import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = new StringBuilder(st.nextToken()).reverse().toString();
        String B = new StringBuilder(st.nextToken()).reverse().toString(); 

        int numA = Integer.parseInt(A);
        int numB = Integer.parseInt(B);

        bw.write(String.valueOf(Math.max(numA, numB)));
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}