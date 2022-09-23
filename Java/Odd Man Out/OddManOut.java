import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class OddManOut {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numCases = Integer.parseInt(bufferedReader.readLine()) + 1;

        for (int i = 1; i < numCases; i++) {
            bufferedReader.readLine();

            String[] guests = bufferedReader.readLine().split(" ");
            Set<String> uniqueNumbers = new HashSet<>();

            for (String guest : guests) {
                if (uniqueNumbers.contains(guest)) {
                    uniqueNumbers.remove(guest);
                }
                else {
                    uniqueNumbers.add(guest);
                }
            }

            System.out.println("Case #" + i + ": " + uniqueNumbers.stream().findFirst().get());
        }

        bufferedReader.close();
    }
}
