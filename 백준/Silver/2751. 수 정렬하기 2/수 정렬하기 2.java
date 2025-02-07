import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numCount = Integer.parseInt(br.readLine()); 
        List<Integer> numbers = new ArrayList<>(numCount);

        for (int i = 0; i < numCount; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(numbers);

        StringBuilder sb = new StringBuilder();
        for (int num : numbers) {
            sb.append(num).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}