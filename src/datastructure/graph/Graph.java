package datastructure.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph {
    private HashMap<String, List<String>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public boolean addVertex(String vertex) {
        if (adjList.get(vertex) != null) {
            return false;
        }
        adjList.put(vertex, new ArrayList<>());
        return true;
    }

    public boolean addEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) == null || adjList.get(vertex2) == null) {
            return false;
        }
        adjList.get(vertex1).add(vertex2);
        adjList.get(vertex2).add(vertex1);
        return true;
    }
    public boolean removeEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) == null || adjList.get(vertex2) == null) {
            return false;
        }
        adjList.get(vertex1).remove(vertex2);
        adjList.get(vertex2).remove(vertex1);
        return true;
    }

    public boolean removeVertex(String vertex){
        if (adjList.get(vertex) == null) {
            return false;
        }
        adjList.get(vertex).forEach( x-> adjList.get(x).remove(vertex));
        adjList.remove(vertex);
        return true;
    }

    public void print() {
        System.out.println(adjList);
    }

}
