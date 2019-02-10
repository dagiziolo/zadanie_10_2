public class ShapeTest {

    public static void main(String[] args) {

        ShapeCalculator calculator = new ShapeCalculator();

        Shape[] shapes = new Shape[5];

        shapes[0] = new Circle(3.5);
        shapes[1] = new Rectangle(5, 5);
        shapes[2] = new Ball(3.5);
        shapes[3] = new Cube(5);

        Point point1 = new Point(1, 4);
        Point point2 = new Point(-1, 4);
        shapes[3] = new Line2D(point1, point2);

        double tmp = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Line2D) {
                tmp = calculator.lineLenght((Line2D) shapes[i]);
                System.out.println(shapes[i].toString() + "] ma długość " + tmp);
            }
            if (shapes[i] instanceof Rectangle) {
                tmp = calculator.shapeArea((GeometricShape) shapes[i]);
                System.out.println(shapes[i].toString() + " ma pole, które wynosi " + tmp);
            }
            if (shapes[i] instanceof Circle) {
                tmp = calculator.shapeArea((GeometricShape) shapes[i]);
                System.out.println(shapes[i].toString()+ " ma pole, które wynosi " + tmp);
            }
            if (shapes[i] instanceof Ball) {
                tmp = calculator.valume((Shape3D) shapes[i]);
                System.out.println(shapes[i].toString()+ " ma objętość, które wynosi " + tmp);
            }
            if (shapes[i] instanceof Cube) {
                tmp = calculator.valume((Shape3D) shapes[i]);
                System.out.println(shapes[i].toString()+ " ma objętość, które wynosi " + tmp);
            }

        }

    }
}
