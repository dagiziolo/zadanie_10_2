public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {


    @Override
    public double circleArea(Circle circle) {
        double tmp = Math.pow(circle.getRadius(), 2) * Math.PI;
        return tmp;
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        double tmp = rectangle.getSideA() * rectangle.getSideB();
        return tmp;
    }

    @Override
    public double ballVolume(Ball ball) {
        double tmp = (double) 4 / 3 * Math.PI * Math.pow(ball.getRadiusBall(), 3);
        return tmp;
    }

    @Override
    public double cubeVolume(Cube cube) {
        double tmp = Math.pow(cube.getEdge(), 3);
        return tmp;
    }
}
