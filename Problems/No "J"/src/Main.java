import java.util.*;

public class Main {

    public static void processIterator(String[] array) {
        ListIterator<String> list = new ArrayList<String>(Arrays.asList(array))
                .listIterator();


        while (list.hasNext()) {
            String item = list.next();
            if (item.startsWith("J")) {
                list.set(item.replace("J", ""));
            } else {
                list.remove();
            }
        }

        while (list.hasPrevious()) {
            System.out.println(list.previous());
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processIterator(scanner.nextLine().split(" "));
    }
}