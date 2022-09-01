import java.util.Scanner;
import java.lang.Math;

public class Sibice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num_Matches = scanner.nextInt();

        int width = scanner.nextInt();
        int length = scanner.nextInt();
        double maxMatchLength = Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));

        for (int i = 0; i < num_Matches; i++) {
            if (scanner.nextInt() <= maxMatchLength) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }

        scanner.close();
    }
}
