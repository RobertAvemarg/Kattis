import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class KittenOnATree {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int catPosition = Integer.parseInt(bufferedReader.readLine());
        Map<Integer, Integer> tree = readTree(bufferedReader);

        bufferedReader.close();

        System.out.println(createResult(tree, catPosition));
    }

    private static Map<Integer, Integer> readTree(BufferedReader bufferedReader) throws IOException{
        Map<Integer, Integer> tree = new HashMap<>();
        String[] line = bufferedReader.readLine().split(" ");

        while (!line[0].equals("-1")) {
            for (int i = 1; i < line.length; i++) {
                tree.put(Integer.parseInt(line[i]), Integer.parseInt(line[0]));
            }
            line = bufferedReader.readLine().split(" ");
        }

        return tree;
    }

    private static String createResult(Map<Integer, Integer> tree, int catPosition) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.valueOf(catPosition));

        while (tree.containsKey(catPosition)) {
            catPosition = tree.get(catPosition);
            stringBuilder.append(" " + String.valueOf(catPosition));
        }

        return stringBuilder.toString();
    }
}