public class ShapeTest {

    public static void main(String[] args) {

        ShapeCalculator calculator = new ShapeCalculator();


        Circle circle1= new Circle(3.5);
        System.out.println("Pole koła: " + calculator.circleArea(circle1));


        Rectangle rectangle = new Rectangle(5,5);
        System.out.println("Pole prostokąta: " + calculator.rectangleArea(rectangle));

        Ball ball = new Ball(3.5);
        System.out.println("Objętość kuli: " + calculator.ballVolume(ball));

        Point point1 = new Point(1,4);
        Point point2 = new Point(-1,4);
        Line2D line = new Line2D(point1,point2);
        System.out.println("Długość lini: " + calculator.lineLenght(line));

    }
}
