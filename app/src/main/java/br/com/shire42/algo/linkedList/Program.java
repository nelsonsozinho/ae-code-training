package br.com.shire42.algo.linkedList;

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

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        deepList(linkedList);
        return linkedList;
    }

    private void deepList(LinkedList root) {
        if(root == null || isTheEndOfList(root))
            return;

        if(Objects.equals(root.value, root.next.value)) {
            if(isTheEndOfList(root.next)) {
                root.next = null;
            } else {
                root.next = root.next.next;
                deepList(root);
            }
        }

        deepList(root.next);
    }

    private boolean isTheEndOfList(LinkedList root) {
        return root.next == null;
    }

}
