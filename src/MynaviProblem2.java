import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MynaviProblem2 {
    public static void main(String[] args) throws Exception {
        MynaviProblem2 main = new MynaviProblem2();
        List<String> result = main.generation();

        for (String string : result) {
            System.out.println(string);
        }
    }

    public List<String> generation() {
        Scanner sc = new Scanner(System.in);
        Optional.ofNullable(sc).orElseThrow();

        int in = sc.nextInt();
        if (in < 0 || 21 < in) {
            throw new IllegalArgumentException("inputSizeIllegal:" + in);
        }

        List<String> result = new ArrayList<String>();

        int firstInt = 0;
        int firstCount = in;

        while (true) {
            int secondCount = in - firstInt;
            int secondInt = 0;
            while (true) {
                int lastInt = 0;
                int lastCount = in - firstInt - secondInt;
                while (true) {
                    result.add(firstInt + " " + secondInt + " " + lastInt);
                    if (lastCount == lastInt) {
                        break;
                    }
                    lastInt++;
                }
                if (secondCount == secondInt) {
                    break;
                }
                secondInt++;
            }
            if (firstCount == firstInt) {
                break;
            }
            firstInt++;
        }
        return result;
    }
}
