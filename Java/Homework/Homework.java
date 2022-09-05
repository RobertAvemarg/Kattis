import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        scanner.close();

        String[] problems = line.split(";");
        int numProblems = processInput(problems);

        System.out.println(numProblems);
    }

    private static int processInput(String[] problems) {
        int numProblems = 0;
        for (String problem : problems) {
            if (problem.contains("-")) {
                String[] range = problem.split("-");

                numProblems += Integer.parseInt(range[1]) - Integer.parseInt(range[0]) + 1;
            }
            else {
                numProblems += 1;
            }
        }

        return numProblems;
    }
}