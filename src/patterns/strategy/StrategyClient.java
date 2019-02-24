package patterns.strategy;

import java.util.*;

interface Sortable {
    void sort(List<Integer> list);

}

public class StrategyClient {
    private Sortable sortable;

    public StrategyClient(Sortable sortable) {
        this.sortable = sortable;
    }

    public void setSortable(Sortable sortable) {
        this.sortable = sortable;
    }

    public void execute(List<Integer> list) {

        System.out.println();
        sortable.sort(list);
        System.out.println();
    }
}

class RightSort implements Sortable {
    @Override
    public void sort(List<Integer> list) {
        Collections.sort(list);
    }
}

class ReverseSort implements Sortable {
    @Override
    public void sort(List<Integer> list) {

//        Comparator<Integer> comparator = Integer::compareTo;
//        Comparator<Integer> comparator = (v1, v2) -> Integer.compare(v1, v2);
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };

        list.sort(comparator.reversed());
    }
}

class TestStrategy {
    public static void main(String[] args) {

        Sortable rightSort = new RightSort();

        Sortable reverseSort = new ReverseSort();

        StrategyClient client = new StrategyClient(rightSort);

        List<Integer> list = Arrays.asList(1, 2, -5, -6, 0);

        int[] intMass = {1, 2, 5, 10};

        List<int[]> ints = Arrays.asList(intMass);
/*
* (Object src,  int  srcPos,
                                        Object dest, int destPos,
                                        int length);

* */
/* тоже не получилось
 Integer[] dest = new Integer[1000];

        System.arraycopy(intMass, 0, dest, 0, 1000);*/

//        Integer[] ints1 = Arrays.copyOfRange(intMass, 0, intMass.length);

//        //false
//        Collections.frequency(ints, 1);
//
//
//        Integer[] integerMass = {1, 2, 5, 10};
//
//        List<Integer> integers = Arrays.asList(integerMass);
//        //true!!!
//        Collections.frequency(integers, 1);

        client.execute(list);

        client.setSortable(reverseSort);

        client.execute(list);

    }
}
