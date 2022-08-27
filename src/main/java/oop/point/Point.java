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

    public double distance(Point point) {
        return sqrt(pow((point.getPointX() - this.pointX), 2) + pow(
            (point.getPointY() - this.pointY), 2));
    }

    public int getPointX() {
        return pointX;
    }

    public int getPointY() {
        return pointY;
    }
}
