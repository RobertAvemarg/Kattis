import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                long a = scanner.nextLong();
                long b = scanner.nextLong();

                if (a > b) {
                    System.out.println(a - b);
                } else {
                    System.out.println(b - a);
                }
            } catch (Exception e) {
                break;
            }
        }

        scanner.close();
    }
}
