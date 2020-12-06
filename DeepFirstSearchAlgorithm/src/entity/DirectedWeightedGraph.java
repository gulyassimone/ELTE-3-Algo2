package entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class DirectedWeightedGraph<S> {
    ArrayList<LinkedList<Edge>>[] adjacencylist;

    public DirectedWeightedGraph( String[] label) {
        adjacencylist = new ArrayList[label.length];
        LinkedList<Edge> elem = new LinkedList<>();
        Arrays.stream(label).forEach(x ->  );
    }

    public void addEgde(S source, S destination, int weight) {
        Edge edge = new Edge(source, destination, weight);

        adjacencylist[adjacencylist.length].addFirst(edge); //for directed graph
    }

    public void printGraph(){
        for (int i = 0; i <adjacencylist.length ; i++) {
            LinkedList<Edge> list = adjacencylist[i];
            for (int j = 0; j <list.size() ; j++) {
                System.out.println("vertex-" + i + " is connected to " +
                        list.get(j).destination + " with weight " +  list.get(j).weight);
            }
        }
    }
}