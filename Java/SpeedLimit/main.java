import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        SpeedLimit sl = new SpeedLimit();
        sl.readAndProcess();
    }
}

class SpeedLimit {
    public SpeedLimit() {
    }

    public void readAndProcess() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int distance = 0;
            int milesPerHour = 0;
            int lastTimestamp = 0;
            int currentTimestamp = 0;

            int input = scanner.nextInt();

            if (input == -1) {
                break;
            }

            for (int i = 0; i < input; i++) {
                milesPerHour = scanner.nextInt();
                currentTimestamp = scanner.nextInt();

                distance += milesPerHour * (currentTimestamp - lastTimestamp);

                lastTimestamp = currentTimestamp;
            }

            System.out.println(distance + " miles");
        }

        scanner.close();
    }
}