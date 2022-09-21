import java.util.Scanner;

public class FlowLayout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxWidth = scanner.nextInt();

        while(maxWidth != 0) {
            int windowWidth = 0;
            int windowHeight = 0;

            int rowWidth = 0;
            int rowHeight = 0;

            int givenWidth = scanner.nextInt();
            int givenHeight = scanner.nextInt();

            while (givenWidth != -1) {
                if (rowWidth + givenWidth <= maxWidth) {
                    rowWidth += givenWidth;
                    rowHeight = Math.max(rowHeight, givenHeight);
                }
                else {
                    windowWidth = Math.max(windowWidth, rowWidth);
                    windowHeight += rowHeight;
                    rowWidth = givenWidth;
                    rowHeight = givenHeight;
                }

                givenWidth = scanner.nextInt();
                givenHeight = scanner.nextInt();
            }

            windowWidth = Math.max(windowWidth, rowWidth);
            windowHeight += rowHeight;

            System.out.println(windowWidth + " x " + windowHeight);

            maxWidth = scanner.nextInt();
        }

        scanner.close();
    }
}
