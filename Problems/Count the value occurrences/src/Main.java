import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        int list1Count = 0;
        int list2Count = 0;

        for (int item : list1) {
            if(item == elem)
                list1Count++;
        }

        for (int item : list2) {
            if(item == elem)
                list2Count++;
        }

        return list1Count == list2Count;
    }
}