package datastructure.graph;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.print();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.print();

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "C");
        graph.addEdge("A", "D");
        graph.addEdge("B", "D");
        graph.addEdge("C", "D");

        graph.print();

        graph.removeEdge("A", "B");
        graph.print();

        graph.addEdge("A", "B");
        graph.print();

        graph.removeVertex("D");
        graph.print();



    }
}
