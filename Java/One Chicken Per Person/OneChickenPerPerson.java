import java.util.Scanner;

public class OneChickenPerPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = scanner.nextInt();
        int chicken = scanner.nextInt();

        scanner.close();

        int difference = chicken - persons;

        if (difference > 0) {
            System.out.println(String.format("Dr. Chaz will have %d %s of chicken left over!", difference, difference > 1? "pieces" : "piece"));
        }
        else {
            System.out.println(String.format("Dr. Chaz needs %d more %s of chicken!", -difference, -difference > 1? "pieces" : "piece"));
        }
    }
}
