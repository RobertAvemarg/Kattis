import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class BasicProgramming {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int inputOperation = Integer.parseInt(bufferedReader.readLine().split(" ")[1]);
        int[] data = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        bufferedReader.close();

        Operation operation = new GetSeven();

        switch (inputOperation) {
            case 2:
                operation = new CompareFirstTwoElements();
                break;
            case 3:
                operation = new CalculateMedianOfFirstThreeElements();
                break;
            case 4:
                operation = new SumElements();
                break;
            case 5:
                operation = new SumEvenElements();
                break;
            case 6:
                operation = new ConvertElementsToString();
                break;
            case 7:
                operation = new WalkThroughIndices();
                break;
        }

        System.out.println(operation.execute(data));
    }
}


interface Operation {
    abstract public String execute(int[] data);
}


class GetSeven implements Operation {
    public GetSeven() {}

    @Override
    public String execute(int[] data) {
        return "7";
    }
}


class CompareFirstTwoElements implements Operation {
    public CompareFirstTwoElements() {}

    @Override
    public String execute(int[] data) {
        if (data[0] > data[1]) {
            return "Bigger";
        }
        if (data[0] == data[1]) {
            return "Equal";
        }
        return "Smaller";
    }
}


class CalculateMedianOfFirstThreeElements implements Operation {
    public CalculateMedianOfFirstThreeElements() {}

    @Override
    public String execute(int[] data) {
        return String.valueOf(Arrays.stream(data)
                                    .limit(3)
                                    .sorted()
                                    .skip(1)
                                    .limit(1)
                                    .toArray()[0]);
    }
}


class SumElements implements Operation {
    public SumElements() {}

    @Override
    public String execute(int[] data) {
        return String.valueOf(Arrays.stream(data)
                                    .mapToLong(e -> e)
                                    .reduce(0, Long::sum));
    }
}


class SumEvenElements implements Operation {
    public SumEvenElements() {}

    @Override
    public String execute(int[] data) {
        return String.valueOf(Arrays.stream(data)
                                    .filter(e -> e % 2 == 0)
                                    .mapToLong(e -> e)
                                    .reduce(0, Long::sum));
    }
}


class ConvertElementsToString implements Operation {
    public ConvertElementsToString() {}

    @Override
    public String execute(int[] data) {
        return Arrays.stream(data).map(e -> (e % 26) + 97).mapToObj(e -> String.valueOf((char)e)).collect(Collectors.joining());
    }
}


class WalkThroughIndices implements Operation {
    public WalkThroughIndices() {}

    @Override
    public String execute(int[] data) {
        int arrayLength = data.length;
        Set<Integer> visitedIndices = new HashSet<Integer>();

        int currentIndex = data[0];

        while (true) {
            if (currentIndex >= arrayLength) {
                return "Out";
            }

            if (currentIndex == arrayLength - 1) {
                return "Done";
            }

            if (visitedIndices.contains(currentIndex)) {
                return "Cyclic";
            }

            visitedIndices.add(currentIndex);
            currentIndex = data[currentIndex];
        }
    }
}