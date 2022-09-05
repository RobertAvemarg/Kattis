import java.util.Scanner;

public class Pyramids {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numBlocks = scanner.nextInt();
        scanner.close();

        int height = 0;
        int sideLength = 1;
        int blocksCurrentLayer;

        while (numBlocks >= (blocksCurrentLayer = sideLength * sideLength)) {
            numBlocks -= blocksCurrentLayer;
            sideLength += 2;
            height++;
        }

        System.out.println(height);
    }
}