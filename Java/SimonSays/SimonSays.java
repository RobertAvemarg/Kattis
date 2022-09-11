// runtime error?

import java.util.Scanner;

public class SimonSays {

    private static int MIN_LINE_LENGTH = 11;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numLines; i++) {
            String line = scanner.nextLine();

            if (line.length() >= MIN_LINE_LENGTH && line.startsWith("simon says")) {
                System.out.println(line.substring(MIN_LINE_LENGTH));
            }
        }

        scanner.close();
    }
}