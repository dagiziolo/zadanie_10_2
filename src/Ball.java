public class Ball extends Shape3D {
    private double radiusBall;

    public Ball(double radiusBall) {
        this.radiusBall = radiusBall;
    }

    public double getRadiusBall() {
        return radiusBall;
    }

    public void setRadiusBall(double radiusBall) {
        this.radiusBall = radiusBall;
    }

    @Override
    public String toString() {
        return "Kula o promieniu " + (getRadiusBall() );
    }
}
