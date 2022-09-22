import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Veci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberString = scanner.nextLine();
        int number = Integer.parseInt(numberString);

        List<Integer> visitedDigits = new LinkedList<>();
        int currentDigit = 0;

        int pos = numberString.length();
        boolean possible = false;

        while (number != 0) {
            currentDigit = number % 10;
            visitedDigits.add(currentDigit);

            if (found(visitedDigits, currentDigit)) {
                possible = true;
                break;
            }

            number /= 10;
            pos--;
        }

        if (!possible) {
            System.out.println(0);
            return;
        }

        int digitToSwap = getDigitToSwap(visitedDigits, currentDigit);
        visitedDigits.remove((Integer)digitToSwap);

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(numberString.substring(0, pos-1));
        sBuilder.append(digitToSwap);
        sBuilder.append(String.join("", visitedDigits.stream().sorted().map(e -> String.valueOf(e)).collect(Collectors.toList())));

        System.out.println(sBuilder.toString());
    }

    private static boolean found(List<Integer> visitedDigits, int currentDigit) {
        return visitedDigits.stream().filter(e -> e > currentDigit).findAny().isPresent();
    }

    private static int getDigitToSwap(List<Integer> visitedDigits, int currentDigit) {
        return visitedDigits.stream().filter(e -> e > currentDigit).sorted().limit(1).collect(Collectors.toList()).get(0);
    }
}
