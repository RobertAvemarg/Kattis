import java.util.Scanner;

public class PolygonArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        arraySolution(scanner);

        scanner.close();
    }

    public static void variableSolution(Scanner scanner) {
                int numPoints = scanner.nextInt();

        while (numPoints != 0) {
            double doubleArea = 0;

            int xFirstPoint = scanner.nextInt();
            int yFirstPoint = scanner.nextInt();

            int xPrev = xFirstPoint;
            int yPrev = yFirstPoint;

            int xCurr = 0;
            int yCurr = 0;

            for (int i = 0; i < numPoints - 1; i++) {
                xCurr = scanner.nextInt();
                yCurr = scanner.nextInt();

                doubleArea += xPrev * yCurr - yPrev * xCurr;

                xPrev = xCurr;
                yPrev = yCurr;
            }

            doubleArea += xCurr * yFirstPoint - yCurr * xFirstPoint;
            if (doubleArea >= 0) {
                System.out.println(String.format("CCW %.1f", doubleArea * 0.5));
            }
            else {
                System.out.println(String.format("CW %.1f", -doubleArea * 0.5));
            }

            numPoints = scanner.nextInt();
        }
    }


    public static void arraySolution(Scanner scanner) {
        int numPoints = scanner.nextInt();

        while (numPoints != 0) {
            int[] x = new int[numPoints];
            int[] y = new int[numPoints];

            for (int i = 0; i < numPoints; i++) {
                x[i] = scanner.nextInt();
                y[i] = scanner.nextInt();
            }

            double area = calculateArea(x, y);
            System.out.println((area >= 0) ? String.format("CCW %.1f", area) : String.format("CW %.1f", -area));

            numPoints = scanner.nextInt();
        }
    }

    private static double calculateArea(int[] x, int[] y) {
        int numPoints = x.length;
        double doubleArea = x[numPoints-1] * y[0] - y[numPoints-1] * x[0];

        for (int i = 1; i < numPoints; i++) {
            doubleArea += x[i-1] * y[i] - y[i-1] * x[i];
        }

        return doubleArea / 2;
    }
}