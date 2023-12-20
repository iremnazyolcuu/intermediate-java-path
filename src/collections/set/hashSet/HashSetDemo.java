package collections.set.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {

        // Set<Integer> hSet= new HashSet<>();
        HashSet<Integer> hSet = new HashSet<>();

        // add element
        hSet.add(10);
        hSet.add(20);
        hSet.add(30);
        hSet.add(null);

        // remove element
        hSet.remove(10);

        // size
        System.out.println(hSet.size());

        // isEmpty
        System.out.println(hSet.isEmpty());

        // contains
        System.out.println(hSet.contains(30));

        // clear
        // hSet.clear();

        for (Integer number : hSet) {
            System.out.println(number);
        }

        // Iterator kullanarak gezinmek:
        Iterator<Integer> itr = hSet.iterator();
        System.out.println("*** With Iterator ***");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
