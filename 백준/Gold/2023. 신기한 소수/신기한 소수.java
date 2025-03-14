import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); 
        br.close(); 

        int[] startNums = {2, 3, 5, 7}; 
        for (int num : startNums) {
            findAmazingPrimes(num, N, bw);
        }
        
        bw.flush(); 
        bw.close(); 
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;

        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void findAmazingPrimes(int num, int N, BufferedWriter bw) throws IOException {
        if (String.valueOf(num).length() == N) { 
            bw.write(num + "\n");
            return;
        }

        for (int i = 1; i <= 9; i += 2) { 
            int newNum = num * 10 + i; 

            if (isPrime(newNum)) { 
                findAmazingPrimes(newNum, N, bw);
            }
        }
    }
}