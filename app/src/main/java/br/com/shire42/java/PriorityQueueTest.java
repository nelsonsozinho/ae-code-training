package br.com.shire42.java;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

    public static void main(String...args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(2);
        queue.add(1);
        queue.add(5);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
    }


}
