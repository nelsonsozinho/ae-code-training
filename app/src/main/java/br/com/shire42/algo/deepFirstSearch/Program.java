package br.com.shire42.algo.deepFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static class Node {
        String name;
        public List<Node> children = new ArrayList<>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            // Write your code here.
            array.add(this.name);
            goDeep(children, array);
            return array;
        }

        private void goDeep(List<Node> nodes, List<String> strList) {
            if(nodes.isEmpty())
                return;

            for(Node node: nodes) {
                strList.add(node.name);
                goDeep(node.children, strList);
            }
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }

}
