package br.com.shire42.algo.graphs;

import java.util.HashSet;
import java.util.Set;

public class MyDFS {

    public void dfs(Graph graph, int start, Set<Integer> visited) {
        if(visited.contains(start)) {
            return;
        }
        visited.add(start);
        System.out.println(start + " ");
        for(Integer neighbor : graph.getNeighbors(start)) {
            dfs(graph, neighbor, visited);
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

        MyDFS dfs = new MyDFS();
        dfs.dfs(graph, 1, new HashSet<>());

    }

}
