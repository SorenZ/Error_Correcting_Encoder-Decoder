import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> firstList = Arrays.asList(new Scanner(System.in).nextLine().split(" "));
        List<String> secondList = Arrays.asList(new Scanner(System.in).nextLine().split(" "));

        System.out.println(Collections.indexOfSubList(firstList, secondList) + " " + Collections.lastIndexOfSubList(firstList, secondList));

    }
}