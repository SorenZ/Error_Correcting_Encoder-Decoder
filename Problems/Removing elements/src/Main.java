import java.util.*;

class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        Set<Integer> set = new HashSet<Integer>();

        for (String item : str.split(" "))
            set.add(Integer.parseInt(item));

        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
//        TreeSet<Integer> treeSet = new TreeSet<>(set);
//        set = treeSet.headSet(11);
        set.removeIf(integer -> integer > 10);
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}
