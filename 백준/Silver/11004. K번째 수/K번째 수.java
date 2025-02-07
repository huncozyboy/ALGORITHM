import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int numCount = Integer.parseInt(tokenizer.nextToken()); 
        int targetIndex = Integer.parseInt(tokenizer.nextToken());
        
        int[] numbers = new int[numCount];
        tokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < numCount; i++) {
            numbers[i] = Integer.parseInt(tokenizer.nextToken());
        }
        
        Arrays.sort(numbers);
        
        bw.write(numbers[targetIndex - 1] + "\n");
        
        bw.flush();
        bw.close();
        br.close();
    }
}