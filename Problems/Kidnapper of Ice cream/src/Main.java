import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newspaper = scanner.nextLine();

        String[] letter = scanner.nextLine()
                .split(" ");

        for (String item :
                letter) {
            if (!newspaper.contains(item)) {
                System.out.println("You are busted");
                return;
            } else {
                newspaper = newspaper.replace(item, "");
            }
        }

        System.out.println("You get money");


    }
}