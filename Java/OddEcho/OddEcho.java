import java.util.Scanner;

public class OddEcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numLines; i++) {
            String line = scanner.nextLine();

            if (i % 2 == 0) {
                System.out.println(line);
            }
        }
        scanner.close();
    }
}
