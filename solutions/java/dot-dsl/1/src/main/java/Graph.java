import java.util.Collection;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
public class Graph {
    private final Set<Node> nodes;
    private final Set<Edge> edges;
    private final Map<String, String> attributes;
    public Graph() {
        nodes = new HashSet<>();
        edges = new HashSet<>();
        attributes = new HashMap<>();
    }

    public Graph(Map<String, String> attributes) {
        nodes = new HashSet<>();
        edges = new HashSet<>();
        this.attributes = attributes;
    }

    public Collection<Node> getNodes() {
        return nodes;
    }

    public Collection<Edge> getEdges() {
        return edges;
    }

    public Graph node(String name) {
        Node node = new Node(name);
        nodes.add(node);
        return this;
    }

    public Graph node(String name, Map<String, String> attributes) {
        Node node = new Node(name,attributes);
        nodes.add(node);
        return this;
    }

    public Graph edge(String start, String end) {
        Edge edge = new Edge(start,end);
        edges.add(edge);
        return this;
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        Edge edge = new Edge(start,end,attributes);
        edges.add(edge);
        return this;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }
}
