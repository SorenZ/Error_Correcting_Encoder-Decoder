import java.util.Scanner;
import java.util.logging.Level;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] levels = scanner.nextLine().toUpperCase().split(" ");

        int total = 0;
        for (String level :
                levels) {
            total += Level.parse(level).intValue();
        }

        System.out.print(total);

    }
}