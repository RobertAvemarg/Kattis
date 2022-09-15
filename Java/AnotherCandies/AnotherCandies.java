import java.util.Scanner;

public class AnotherCandies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numGroups = Integer.parseInt(scanner.nextLine());

        for (int g = 0; g < numGroups; g++) {
            scanner.nextLine();

            long numChildren = Long.parseLong(scanner.nextLine());
            long numCandies = 0;

            for (int i = 0; i < numChildren; i++) {
                numCandies += Long.parseLong(scanner.nextLine()) % numChildren;
            }

            System.out.println((numCandies % numChildren == 0)? "YES" : "NO");
        }

        scanner.close();
    }
}
