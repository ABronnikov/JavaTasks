package oop.point;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import java.util.Objects;

public class Point {

    private int pointX;
    private int pointY;

    public Point() {
    }

    public Point(int pointX, int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public static double distance(Point point1, Point point2) {
        if (Objects.nonNull(point1) && Objects.nonNull(point2)) {
            return sqrt(pow((point2.getPointX() - point1.getPointX()), 2) + pow(
                (point2.getPointY() - point1.getPointY()), 2));
        } else {
            return 0.0;
        }
    }

    public int getPointX() {
        return pointX;
    }

    public int getPointY() {
        return pointY;
    }
}
