package lesson7;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        Scanner scanner = new Scanner(System.in);

        graph.addEdge(0, 1);
        graph.addEdge(0, 7);
        graph.addEdge(1, 1);
        graph.addEdge(1, 5);
        graph.addEdge(2, 3);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);
        graph.addEdge(5, 9);
        graph.addEdge(6, 8);
        graph.addEdge(6, 7);
        graph.addEdge(8, 9);

        BreadthFirstPath bfp = new BreadthFirstPath(graph,0);
        bfp.showAdjacencyList(graph);

        LinkedList<Integer> path;
        int from = scanner.nextInt();//4;
        int to = scanner.nextInt();//7;
        path = bfp.findShortestPathFromTo(graph, from, to);
        System.out.println("The shortest way from " + from + " to " + to + ": " + path);

        //1 1
        //The shortest way from 1 to 1: []
        //4 7
        //The shortest way from 4 to 7: [6, 7]
        //0 9
        //The shortest way from 0 to 9: [1, 5, 9]
        //0 8
        //The shortest way from 0 to 8: [7, 6, 8]
        //3 2
        //The shortest way from 3 to 2: [2]
        //9 3
        //The shortest way from 9 to 3: []

    }
}
