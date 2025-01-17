import java.util.Scanner;

public class Main {
    // 첫째 줄에 다음 세 가지 중 하나를 출력한다.
    //
    //A가 B보다 큰 경우에는 '>'를 출력한다.
    //A가 B보다 작은 경우에는 '<'를 출력한다.
    //A와 B가 같은 경우에는 '=='를 출력한다.
    public String solution(int A, int B) {
        if (A > B) {
            return ">";
        } else if (A < B) {
            return "<";
        } else {
            return "==";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // 결과 출력
        Main obj = new Main();
        System.out.println(obj.solution(A, B));

        scanner.close();
    }
}