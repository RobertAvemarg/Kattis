import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class Arrangement {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int rooms = Integer.parseInt(bufferedReader.readLine());
        int teams = Integer.parseInt(bufferedReader.readLine());

        bufferedReader.close();

        int arrangedTeams = Math.floorDiv(teams, rooms);
        int remainingTeams = teams % rooms;

        for (int i = 0; i < remainingTeams; i++) {
            System.out.println(String.join("", Collections.nCopies(arrangedTeams + 1, "*")));
        }
        for (int i = 0; i < rooms - remainingTeams; i++) {
            System.out.println(String.join("", Collections.nCopies(arrangedTeams, "*")));
        }
    }
}
