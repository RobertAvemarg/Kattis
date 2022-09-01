import java.util.Scanner;

class Bijele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] correctQuantity = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < correctQuantity.length; i++) {
            int currentFigure = scanner.nextInt();
            System.out.println(correctQuantity[i] - currentFigure);
        }

        scanner.close();
    }
}
