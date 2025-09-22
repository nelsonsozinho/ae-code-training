package br.com.shire42.java;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueWithComparator {

    public static void main(String...args) {
        Queue<Integer> queue = new PriorityQueue<>(new PersonalComparator());
        for(int i=0;i<5;i++) {
            queue.add(i);
        }

        System.out.println(queue);

        System.out.println("Head of queue: " + queue.peek());

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }

}

class PersonalComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        int value = o1.compareTo(o2);
        if(value > 0) {
            return -1;
        } else if(value < 0) {
            return 1;
        }
        return 0;
    }
}
