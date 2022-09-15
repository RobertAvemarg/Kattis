import java.util.Arrays;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCases = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numCases; i++) {
            int numShops = Integer.parseInt(scanner.nextLine());

            int[] positions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int greatestPosition = Arrays.stream(positions).reduce(0, Integer::max);
            int smallestPosition = Arrays.stream(positions).reduce(Integer.MAX_VALUE, Integer::min);

            System.out.println(2 * (greatestPosition - smallestPosition));
        }

        scanner.close();
    }
}
