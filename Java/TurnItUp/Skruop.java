import java.util.Scanner;

class Skruop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentVolume = 7;
        int numLines = scanner.nextInt();

        for (int i = 0; i <= numLines; i++) {
            String currentLine = scanner.nextLine();
            if (currentLine.equals("Skru op!") && currentVolume < 10 ) {
                currentVolume++;
            }
            if (currentLine.equals("Skru ned!") && currentVolume > 0) {
                currentVolume--;
            }
        }

        System.out.println(currentVolume);
    }
}