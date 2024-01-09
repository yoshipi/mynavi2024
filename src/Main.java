import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Optional.ofNullable(sc).orElseThrow();

        int n = sc.nextInt();

        if (n < 3 || 45 < n) {
            throw new IllegalArgumentException("Argument range is illegal");

        }

        if (n % 2 == 1) {
            throw new IllegalArgumentException("Argument must be Odd");
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    }

}
