package collections.queue.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<String> priQue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        priQue.add("Iremnaz");
        priQue.add("Python");
        priQue.add("Java");

        for (String s : priQue){
            System.out.println(s);
        }
    }
}
