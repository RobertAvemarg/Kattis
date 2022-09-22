import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CodeToSaveLives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTestCases = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numTestCases; i++) {
            String[] line1 = scanner.nextLine().split(" ");
            String[] line2 = scanner.nextLine().split(" ");

            int number1 = Integer.parseInt(String.join("", Arrays.asList(line1)));
            int number2 = Integer.parseInt(String.join("", Arrays.asList(line2)));

            int result = number1 + number2;

            List<String> output = new ArrayList<>();

            while (result != 0) {
                output.add(String.valueOf(result % 10));
                result /= 10;
            }

            Collections.reverse(output);

            System.out.println(String.join(" ", output));
        }

        scanner.close();
    }
}
