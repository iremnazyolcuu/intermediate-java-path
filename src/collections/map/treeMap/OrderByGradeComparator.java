package collections.map.treeMap;

import java.util.Comparator;

public class OrderByGradeComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
