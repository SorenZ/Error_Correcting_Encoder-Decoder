import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");
        List<String> list = Arrays.asList(strings);

        String character = scanner.nextLine();

        System.out.print(Collections.frequency(list, character));

    }
}