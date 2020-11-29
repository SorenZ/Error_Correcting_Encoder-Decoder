import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine()
                .toLowerCase()
                .split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String item :
                str) {
            if (map.containsKey(item)) {
               map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
        }

        map.forEach((key, value) -> System.out.printf("%s %d%n", key, value));
    }
}