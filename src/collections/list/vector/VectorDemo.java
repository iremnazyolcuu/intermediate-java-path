package collections.list.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        // add element
        vector.add("Istanbul");
        vector.add("Amsterdam");
        vector.add("New York");
        vector.add("Tokyo");

        vector.add(2, "Paris");

        // contains
        System.out.println(vector.contains("Rotterdam"));

        // Iterator
        Iterator<String> itr = vector.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // for-each
        for (String str : vector) {
            System.out.println(str);
        }
    }
}
