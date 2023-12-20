package collections.list.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        List<String> lnkdList = new LinkedList<>();

        // add element
        lnkdList.add("Iremnaz");
        lnkdList.add("Java");
        lnkdList.add("Data");
        lnkdList.add("Java");

        // Iterator
        Iterator<String> itr = lnkdList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
