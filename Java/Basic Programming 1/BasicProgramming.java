import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BasicProgramming {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int operation = Integer.parseInt(bufferedReader.readLine().split(" ")[1]);
        int[] data = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        bufferedReader.close();

        if (operation == Operations.PRINT_SEVEN.getId()) {
            printSeven();
        }

        if (operation == Operations.COMPARE_FIRST_TWO_ELEMENTS.getId()) {
            System.out.println(compareFirstTwoElements(data));
        }

        if (operation == Operations.CALCULATE_MEDIAN_OF_FIRST_THREE_ELEMENTS.getId()) {
            System.out.println(calculateMedianOfFirstThreeElements(data));
        }

        if (operation == Operations.SUM_ELEMENTS.getId()) {
            System.out.println(sumElements(data));
        }

        if (operation == Operations.SUM_EVEN_ELEMENTS.getId()) {
            System.out.println(sumEvenElements(data));
        }

        if (operation == Operations.PRINT_ELEMENTS_AS_CHARS.getId()) {
            printElementsAsChars(data);
        }

        if (operation == Operations.WALK_THROUGH_INDICES.getId()) {
            walkThroughIndices(data);
        }
    }


    private static void printSeven() {
        System.out.println("7");
    }


    private static String compareFirstTwoElements(int[] data) {
        if (data[0] > data[1]) {
            return "Bigger";
        }
        if (data[0] == data[1]) {
            return "Equal";
        }
        return "Smaller";
    }


    private static int calculateMedianOfFirstThreeElements(int[] data) {
        return Arrays.stream(data).limit(3).sorted().skip(1).limit(1).toArray()[0];
    }


    private static long sumElements(int[] data) {
        return Arrays.stream(data).mapToLong(e -> e).reduce(0, Long::sum);
    }


    private static long sumEvenElements(int[] data) {
        return Arrays.stream(data).filter(e -> e % 2 == 0).mapToLong(e -> e).reduce(0, Long::sum);
    }


    private static void printElementsAsChars(int[] data) {
        Arrays.stream(data).map(e -> (e % 26) + 97).mapToObj(e ->(char)e).forEach(e -> System.out.print(e));
        System.out.println();
    }


    private static void walkThroughIndices(int[] data) {
        int arrayLength = data.length;
        Set<Integer> visitedIndices = new HashSet<Integer>();

        int currentIndex = data[0];

        while (true) {
            if (currentIndex >= arrayLength) {
                System.out.println("Out");
                break;
            }

            if (currentIndex == arrayLength - 1) {
                System.out.println("Done");
                break;
            }

            if (visitedIndices.contains(currentIndex)) {
                System.out.println("Cyclic");
                break;
            }

            visitedIndices.add(currentIndex);
            currentIndex = data[currentIndex];
        }
    }
}


enum Operations {
    PRINT_SEVEN(1),
    COMPARE_FIRST_TWO_ELEMENTS(2),
    CALCULATE_MEDIAN_OF_FIRST_THREE_ELEMENTS(3),
    SUM_ELEMENTS(4),
    SUM_EVEN_ELEMENTS(5),
    PRINT_ELEMENTS_AS_CHARS(6),
    WALK_THROUGH_INDICES(7);

    private int id;

    private Operations(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}