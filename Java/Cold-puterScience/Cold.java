import java.util.Arrays;
import java.util.Scanner;

public class Cold {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        streamSolution(scanner);
    }

    private static void naiveSolution(Scanner scanner) {
        int numTemps = scanner.nextInt();
        int numTempsBelowZero = 0;

        for (int i = 0; i < numTemps; i++) {
            int currTemp = scanner.nextInt();

            if (currTemp < 0) {
                numTempsBelowZero++;
            }
        }
        scanner.close();
        System.out.println(numTempsBelowZero);
    }

    private static void streamSolution(Scanner scanner) {
        scanner.nextLine(); // drop first line
        String line = scanner.nextLine();
        scanner.close();

        String[] temperatures = line.split(" ");
        System.out.println(Arrays.stream(temperatures).mapToInt(Integer::parseInt).filter(i -> i < 0).count());
    }
}
