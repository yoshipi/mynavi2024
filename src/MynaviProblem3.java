import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MynaviProblem3 {
    public static void main(String[] args) throws Exception {
        MynaviProblem3 main = new MynaviProblem3();
        main.execute();
    }

    public void execute() {
        Scanner sc = new Scanner(System.in);
        Optional.ofNullable(sc).orElseThrow();

        String[] firstLine = sc.nextLine().split(" ");
        int queryCount = Integer.valueOf(firstLine[1]);

        List<String> positionList = new ArrayList<String>();

        int xHeadPosition = 1;
        int yHeadPosition = 0;
        for (int i = 0; i < queryCount; i++) {
            String[] currentLine = sc.nextLine().split(" ");
            int queryCategory = Integer.valueOf(currentLine[0]);

            if (queryCategory == 1) {
                switch (currentLine[1]) {
                    case "R" -> xHeadPosition++;
                    case "L" -> xHeadPosition--;
                    case "U" -> yHeadPosition++;
                    case "D" -> yHeadPosition--;
                    default -> throw new IllegalArgumentException("MoveQuery is illegal Format");
                }
                positionList.add(position(xHeadPosition, yHeadPosition));
            } else {
                int partsNumber = Integer.valueOf(currentLine[1]);
                int moveQueryCount = positionList.size();
                String position;
                if (moveQueryCount < partsNumber) {
                    position = position(partsNumber - moveQueryCount, 0);
                } else {
                    position = positionList.get(moveQueryCount - partsNumber);
                }
                System.out.println(position);
            }
        }

    }

    public String position(int x, int y) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(x);
        stringBuilder.append(" ");
        stringBuilder.append(y);
        return stringBuilder.toString();
    }
}
