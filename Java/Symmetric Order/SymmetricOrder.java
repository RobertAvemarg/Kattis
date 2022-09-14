import java.util.Scanner;

public class SymmetricOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int setSize = Integer.parseInt(scanner.nextLine());
        int setNumber = 1;

        while (setSize != 0) {
            System.out.println("SET " + setNumber);
            printArray(buildArray(setSize, scanner));

            setSize = Integer.parseInt(scanner.nextLine());
            setNumber++;
        }

        scanner.close();
    }

    public static String[] buildArray(int setSize, Scanner scanner) {
        String[] set = new String[setSize];

        int indexBegin = 0;
        int indexEnd = setSize-1;
        boolean nextToBegin = true;

        for (int i = 0; i < setSize; i++) {
            if (nextToBegin) {
                set[indexBegin] = scanner.nextLine();
                indexBegin++;
                nextToBegin = !nextToBegin;
            }
            else {
                set[indexEnd] = scanner.nextLine();
                indexEnd--;
                nextToBegin = !nextToBegin;
            }
        }

        return set;
    }

    public static void printArray(String[] array) {
        for (String string : array) {
            System.out.println(string);
        }
    }
}
