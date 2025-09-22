package br.com.shire42.algo.graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFS {

    public void bfs(Graph graph, int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while(!queue.isEmpty()) {
            int current = queue.poll();
            System.out.println(current + " ");
            for(int neighbor : graph.getNeighbors(current)) {
                if(!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }

    }

    public static void main(String...args) {
        BFS bfs = new BFS();

        Graph graph = new Graph();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        System.out.println("BFS Transversal ");

        bfs.bfs(graph, 1);
    }

}
