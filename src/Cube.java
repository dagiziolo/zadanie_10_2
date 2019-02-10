public class Cube extends Shape3D {
    private double edge;

    public Cube(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        return "Sześcian o krawędzi " + getEdge() ;

    }
}
