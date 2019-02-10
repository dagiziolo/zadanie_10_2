public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    public double shapeArea(GeometricShape shape) {
        double tmp = 0;
        if (shape instanceof Circle) {
            tmp = Math.pow(((Circle) shape).getRadius(), 2) * Math.PI;
        }
        if (shape instanceof Rectangle) {
            tmp = ((Rectangle) shape).getSideA() * ((Rectangle) shape).getSideB();
        }
        return tmp;
    }

    @Override
    public double valume(Shape3D shape) {
        double tmp = 0;
        if (shape instanceof Ball) {
            tmp = (double) 4 / 3 * Math.PI * Math.pow(((Ball) shape).getRadiusBall(), 3);
        }
        if (shape instanceof Cube) {
            tmp = Math.pow(((Cube) shape).getEdge(), 3);
        }
        return tmp;
    }


}
