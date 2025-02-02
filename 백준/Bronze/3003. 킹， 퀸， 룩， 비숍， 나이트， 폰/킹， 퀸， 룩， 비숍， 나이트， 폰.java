import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] standardPieces = {1, 1, 2, 2, 2, 8};

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] foundPieces = new int[6];

        for (int i = 0; i < 6; i++) {
            foundPieces[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 6; i++) {
            bw.write((standardPieces[i] - foundPieces[i]) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}