import java.util.Optional;
import java.util.Scanner;

public class MynaviProblem1 {
    public static void main(String[] args) throws Exception {
        MynaviProblem1 main = new MynaviProblem1();
        System.out.println(main.convert());
    }

    public String convert() {
        Scanner sc = new Scanner(System.in);
        Optional.ofNullable(sc).orElseThrow();

        String inputString = sc.next();
        if (inputString.length() < 4 || 100 < inputString.length()) {
            throw new IllegalArgumentException("lengthIllegal:" + inputString.length());
        }

        if (!inputString.substring(inputString.length() - 4).equals("2023")) {
            throw new IllegalArgumentException("formatIllegal:" + inputString);
        }
        return inputString.substring(0, inputString.length() - 1) + "4";
    }
}
