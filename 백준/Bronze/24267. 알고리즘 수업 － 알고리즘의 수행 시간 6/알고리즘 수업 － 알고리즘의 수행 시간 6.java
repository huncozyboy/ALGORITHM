import java.io.*;
import java.util.*;

interface Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        long n = Long.parseLong(br.readLine()) - 2;

        System.out.println(((n * n * n) + (3 * n * n) + (2 * n) ) / 6);
        System.out.println(3);
    }
}