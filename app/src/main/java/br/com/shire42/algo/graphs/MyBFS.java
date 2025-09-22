package br.com.shire42.algo.graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class MyBFS {

    public void bfs(Graph graph, Integer start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while(!queue.isEmpty()) {
            int current = queue.poll();
            System.out.println(current + " ");
            for(int neighbor : graph.getNeighbors(current)) {
                if(!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

    }

    public static void main(String...args) {
        Graph graph = new Graph();

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(5, 6);
        graph.addEdge(5, 7);
        graph.addEdge(5, 8);
        graph.addEdge(7, 9);

        MyBFS bfs = new MyBFS();

        bfs.bfs(graph, 1);
    }

}
