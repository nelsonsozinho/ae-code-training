package br.com.shire42.algo.middleNode;

import java.util.Objects;

public class Program {

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList middleNode(LinkedList linkedList) {
        int size = getSize(linkedList, 0);
        int half = size / 2;
        return mountHalfPath(linkedList, half, 0);
    }

    private LinkedList mountHalfPath(LinkedList root, int half, int pathCounter) {
        if(Objects.isNull(root))
            return null;

        if(pathCounter >= half) {
            return root;
        }

        pathCounter += 1;

        return mountHalfPath(root.next, half, pathCounter);
    }

    private int getSize(LinkedList root, int size) {
        if(Objects.isNull(root)) {
            return size;
        }
        size += 1;
        return getSize(root.next, size);
    }

}
