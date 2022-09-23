import java.util.Scanner;

public class ARealChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long area = scanner.nextLong();
        scanner.close();

        double fenceLength = Math.sqrt(area) * 4;

        System.out.println((fenceLength % 1 == 0)? String.format("%.0f", fenceLength) : fenceLength);
    }
}
