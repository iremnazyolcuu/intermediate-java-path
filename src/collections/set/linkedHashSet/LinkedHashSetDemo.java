package collections.set.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        // Set<String> lhSet = new LinkedHashSet<>();
        LinkedHashSet<String> lhSet = new LinkedHashSet<>();

        // add element
        lhSet.add("Monday");
        lhSet.add("Tuesday");
        lhSet.add("Wednesday");
        lhSet.add("Thursday");
        lhSet.add("Friday");
        lhSet.add("Saturday");
        lhSet.add("Sunday");

        // Iterator
        Iterator<String> itr = lhSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
