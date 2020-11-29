import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, String> map = new TreeMap<>();

        int[] letter = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            String[] entry = scanner.nextLine().split(" ");
            map.put(Integer.parseInt(entry[0]),entry[1]);
        }

        SortedMap<Integer, String> submap = map.subMap(letter[0], letter[1] + 1);

        submap.forEach((i, s) -> System.out.printf("%d %s%n", i, s));


    }
}