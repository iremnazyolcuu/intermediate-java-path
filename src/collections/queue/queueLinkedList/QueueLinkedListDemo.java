package collections.queue.queueLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListDemo {

    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        // add(element): adds an element into the queue
        q.add("Iremnaz");
        q.add("Java");

        // offer(element): adds an element into the queue
        q.offer("Patika.dev");

        // element(): returns the head of the queue without removing it
        System.out.println(q.element());

        // remove(): returns and removes the head of the queue
        q.remove("Java");

        // poll(): Returns and removes the head of the queue
        System.out.println(q.poll());

        // peek(): returns the head of the queue without removing it
        System.out.println(q.peek());

        // Iterator
        Iterator<String> itr = q.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
