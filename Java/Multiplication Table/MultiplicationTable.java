import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long tableSize = scanner.nextLong();
        long number = scanner.nextLong();
        int count = 0;

        scanner.close();

        double rootNumber = Math.sqrt(number);
        long minNumberToCheck = (long) Math.ceil((double)number / tableSize);
        long maxNumberToCheck = Math.min(tableSize + 1, (long)rootNumber + 1);

        for (long i = minNumberToCheck; i < maxNumberToCheck; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        count *= 2;

        if (rootNumber % 1 == 0) {
            count--;
        }

        System.out.println(count);
    }
}
