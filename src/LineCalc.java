public class LineCalc {

    public double lineLenght(Line2D line) {
        Point point1 = line.getPoint1();
        Point point2 = line.getPoint2();

        double tmp = Math.sqrt(Math.pow(line.getPoint1().getX() - line.getPoint2().getX(), 2) +
                Math.pow(line.getPoint1().getY() - line.getPoint2().getY(), 2));
        return tmp;
    }

}
