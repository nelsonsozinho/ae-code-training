package br.com.shire42.algo.linkedList;

public class LinkedListSort {

    public Node reverse(Node head) {
        Node node = null;

        while(head != null) {
            Node tmp = head.next;
            head.next = node;
            node = head;
            head = tmp;
        }

        return node;
    }

    //[4 - 5]
    public Node reverseRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node node = reverseRecursive(head.next);
        node.next = head;
        return head;
    }

    public static void main(String...args) {
        LinkedListSort sortUtils = new LinkedListSort();

        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);

//        Node reverseNode = sortUtils.reverse(node);
        Node reverseNode = sortUtils.reverseRecursive(node);


        System.out.println(reverseNode);
    }

}


