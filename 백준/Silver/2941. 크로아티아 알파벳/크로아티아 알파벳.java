import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] croatianAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String word = br.readLine();

        for (String croatian : croatianAlphabets) {
            // 크로아티아 알파벳을 "#"로 변환하여 개수를 줄인다.
            word = word.replace(croatian, "#");
        }

        System.out.println(word.length());

        br.close();
    }
}