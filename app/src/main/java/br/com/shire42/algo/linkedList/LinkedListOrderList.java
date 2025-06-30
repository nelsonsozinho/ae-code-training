import java.util.ArrayList;
import java.util.List;

public class LinkedListOrderList {
    
    public Node solution(Node root) {
        List<Node> nodes = new ArrayList<>();
        reverseList(root, nodes);
        return getRootReverse(nodes);
    }

    private void reverseList(Node head, List<Node> nodeList) {
        if(head == null) {
            return;
        }
        
        reverseList(head.next, nodeList);
        nodeList.add(head);
    }

    private Node getRootReverse(List<Node> nodes) {
        Node root = new Node(nodes.get(0).value);
        Node nodeAux = root;
        for(int i=1; i < nodes.size(); i++) {
            nodeAux.next = new Node(nodes.get(i).value);
            nodeAux = nodeAux.next;
        }

        return root;
    }

    public void printOrder(Node node) {
        if(node == null) return;

        System.out.println(node.value);
        printOrder(node.next);
    }

    public static void main(String...strings) {
        LinkedListOrderList llo = new LinkedListOrderList();
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
