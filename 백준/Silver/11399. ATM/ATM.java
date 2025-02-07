import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int numPeople = Integer.parseInt(reader.readLine()); 
        int[] withdrawTimes = new int[numPeople]; 

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < numPeople; i++) {
            withdrawTimes[i] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(withdrawTimes);

        int totalWaitTime = 0; 
        int accumulatedTime = 0;
        
        for (int time : withdrawTimes) { // 최소 대기 시간
            accumulatedTime += time; 
            totalWaitTime += accumulatedTime; 
        }

        writer.write(totalWaitTime + "\n");
        
        writer.flush();
        writer.close();
        reader.close();
    }
}