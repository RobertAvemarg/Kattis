import java.util.Scanner;
import java.util.stream.IntStream;

public class StuckInATimeLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        IntStream.rangeClosed(1, n).forEach(e -> System.out.println(e + " Abracadabra"));
    }
}
