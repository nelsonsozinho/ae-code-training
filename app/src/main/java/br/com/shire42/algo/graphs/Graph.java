package br.com.shire42.algo.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge(int u, int v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public List<Integer> getNeighbors(Integer node) {
        return adjList.getOrDefault(node, new ArrayList<>());
    }

    public void printGraph() {
        adjList.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
