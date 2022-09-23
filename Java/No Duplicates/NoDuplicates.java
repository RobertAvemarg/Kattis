import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NoDuplicates {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bufferedReader.readLine().split(" ");
        bufferedReader.close();

        long numDistinctWords = Arrays.stream(input).distinct().count();

        System.out.println(input.length == numDistinctWords? "yes" : "no");
    }
}
