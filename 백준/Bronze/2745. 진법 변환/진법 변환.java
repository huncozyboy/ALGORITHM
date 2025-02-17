import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        String number = input[0]; 
        int base = Integer.parseInt(input[1]); 

        int decimalValue = Integer.parseInt(number, base);

        bw.write(decimalValue + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}