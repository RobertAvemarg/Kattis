import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class BaconEggsAndSpam {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numCustomers = Integer.parseInt(bufferedReader.readLine());

        while (numCustomers > 0) {
            Menu menu = new Menu();
            menu.createMap(bufferedReader, numCustomers);
            menu.printMap();

            System.out.println();

            numCustomers = Integer.parseInt(bufferedReader.readLine());
        }

        bufferedReader.close();
    }
}

class Menu {
    private Map<String, TreeSet<String>> menuItems;

    public Menu() {
    }

    public void createMap(BufferedReader bufferedReader, int numCustomers) throws IOException {
       this.menuItems = new TreeMap<String, TreeSet<String>>();

        for (int i = 0; i < numCustomers; i++) {
            String[] order = bufferedReader.readLine().split(" ");

            for (int j = 1; j < order.length; j++) {
                TreeSet<String> set = menuItems.get(order[j]);

                if(set == null) {
                    set = new TreeSet<String>();
                    menuItems.put(order[j], set);
                }

                set.add(order[0]);
            }
        }
    }

    public void printMap() {
        this.menuItems.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + String.join(" ", new ArrayList<String>(entry.getValue())));
        });
    }
}
