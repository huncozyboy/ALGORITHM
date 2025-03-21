import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] xPoints = new int[3];
        int[] yPoints = new int[3];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            xPoints[i] = Integer.parseInt(st.nextToken());
            yPoints[i] = Integer.parseInt(st.nextToken());
        }
        br.close(); 

        int x4 = (xPoints[0] == xPoints[1]) ? xPoints[2] : (xPoints[0] == xPoints[2] ? xPoints[1] : xPoints[0]);
        int y4 = (yPoints[0] == yPoints[1]) ? yPoints[2] : (yPoints[0] == yPoints[2] ? yPoints[1] : yPoints[0]);

        System.out.println(x4 + " " + y4);
    }
}