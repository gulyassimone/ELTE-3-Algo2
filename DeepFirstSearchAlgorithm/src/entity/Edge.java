package entity;
import java.util.LinkedList;
import java.util.Objects;

public class Edge<S> {
    S source;
    S destination;
    int weight;

    public Edge(S source, S destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Edge)) return false;
        Edge<?> edge = (Edge<?>) o;
        return weight == edge.weight &&
                source.equals(edge.source) &&
                destination.equals(edge.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, destination, weight);
    }
}
