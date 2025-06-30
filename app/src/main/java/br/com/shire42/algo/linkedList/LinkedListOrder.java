package br.com.shire42.algo.linkedList;

public class LinkedListOrder {

    public Node solution(Node root) {
        return reverseList(root);
    }

    public Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;        
    }

    public void printOrder(Node node) {
        if(node == null) return;

        System.out.println(node.value);
        printOrder(node.next);
    }

    public static void main(String...strings) {
        LinkedListOrder llo = new LinkedListOrder();
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);

        System.out.println("Order");
        llo.printOrder(node);
        Node newNode = llo.solution(node);
        System.out.println("Reverse");
        llo.printOrder(newNode);
        
    }
}


class Node {
    Node next;
    int value;
    Node(int value) {
        this.value = value;
    }
}


