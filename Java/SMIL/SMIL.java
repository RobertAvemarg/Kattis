import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SMIL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        scanner.close();

        iteration(line);
    }

    public static void regex(String line) {
        String regex = "[:;]-?\\)";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(line);

        while (match.find()) {
            System.out.println(match.start());
        }
    }

    public static void iteration(String line) {
        int lineLength = line.length();

        for (int i = 0; i < lineLength; i++) {
            if (!(line.charAt(i) == ':' || line.charAt(i) == ';')) {
                continue;
            }

            if (i + 1 >= lineLength) {
                break;
            }
            if (line.charAt(i + 1) == ')') {
                System.out.println(i);
                i++;
            }

            if (i + 2 >= lineLength) {
                break;
            }
            if (line.charAt(i + 1) == '-' && line.charAt(i + 2) == ')') {
                System.out.println(i);
                i+=2;
            }
        }
    }
}
