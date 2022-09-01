import java.util.Scanner;

public class ScrollingSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();

        for (int i = 0; i < numTestCases; i++) {
            processTestcase(scanner);
        }

        scanner.close();
    }

    private static void processTestcase(Scanner scanner) {
        int signWidth = scanner.nextInt();
        int numWords = scanner.nextInt();
        int numSwitches = signWidth;

        String currentWord = scanner.next();
        String nextWord;

        for (int j = 0; j < numWords-1; j++) {
            nextWord = scanner.next();

            numSwitches += checkSubstring(currentWord, nextWord, signWidth);

            currentWord = nextWord;
        }

        System.out.println(numSwitches);
    }

    private static int checkSubstring(String currentWord, String nextWord, int signWidth) {
        for (int j2 = 0; j2 < signWidth; j2++) {
            if (currentWord.substring(currentWord.length() - signWidth + j2, currentWord.length()).equals(nextWord.substring(0, signWidth - j2))) {
                return j2;
            }
        }

        return signWidth;
    }
}
