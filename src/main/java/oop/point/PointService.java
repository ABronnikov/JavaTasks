package oop.point;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class PointService {

    public static double distance(Point point1, Point point2) {
        if (point1 != null && point2 != null) {
            return sqrt(pow((point2.getPointX() - point1.getPointX()), 2) + pow(
                (point2.getPointY() - point1.getPointY()), 2));
        } else {
            return 0.0;
        }
    }
}