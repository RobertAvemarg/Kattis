import java.util.Scanner;

public class PieceOfCake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeSize = scanner.nextInt();
        int hCut = scanner.nextInt();
        int vCut = scanner.nextInt();
        scanner.close();

        int biggestH = Math.max(hCut, cakeSize - hCut);
        int biggestV = Math.max(vCut, cakeSize - vCut);

        System.out.println((biggestH * biggestV) * 4);
    }
}
