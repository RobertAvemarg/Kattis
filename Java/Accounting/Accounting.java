import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Accounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPersons = scanner.nextInt();
        int numInstructions = scanner.nextInt();
        Map<Integer, Integer> personWealth = new HashMap<>();
        int currentDefault = 0;

        scanner.nextLine();

        for (int i = 0; i < numInstructions; i++) {
            String[] instruction = scanner.nextLine().split(" ");
            switch (instruction[0]) {
                case "SET":
                    personWealth.put(Integer.parseInt(instruction[1]), Integer.parseInt(instruction[2]));
                    break;
                case "PRINT":
                    System.out.println(personWealth.getOrDefault(Integer.parseInt(instruction[1]), currentDefault));
                    break;
                case "RESTART":
                    personWealth.clear();
                    currentDefault = Integer.parseInt(instruction[1]);
                    break;
                default:
                    break;
            }
        }
    }
}
