import entity.DirectedWeightedGraph;

public class Main {

    public static void main(String[] args) {
        int vertices = 6;
        DirectedWeightedGraph<String> graph = new DirectedWeightedGraph<>();
        graph.addEgde("a", "b", 4);
        graph.addEgde("c", "d", 3);
        graph.addEgde("e", "f", 2);
        graph.addEgde("a", "f", 5);
        graph.addEgde("e", "d", 7);
        graph.addEgde("s", "f", 2);
        graph.addEgde("k", "a", 4);
        graph.addEgde("c", "s", 4);
        graph.addEgde("b", "a", 6);
        graph.printGraph();
    }
}
