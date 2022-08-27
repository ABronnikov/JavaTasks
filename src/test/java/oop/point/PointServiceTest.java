package oop.point;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PointServiceTest {

    @Test
    void distance() {
        Point point1 = new Point(3,1);
        Point point2 = new Point(6,4);
        double result = Point.distance(point1, point2);
        double expected = 4.242640687119285;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void distanceWithCoordinatesAreZero() {
        Point point1 = new Point();
        Point point2 = new Point();
        double result = Point.distance(point1, point2);
        double expected = 0.0;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void distanceWithCoordinatePointAreZero() {
        Point point1 = new Point(3,1);
        Point point2 = new Point();
        double result = Point.distance(point1, point2);
        double expected = 3.1622776601683795;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void distanceWithPointAreNull() {
        Point point2 = new Point();
        double result = Point.distance(null, point2);
        double expected = 0.0;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void distanceWithPointAreNullAndCoordinatePointNotZero() {
        Point point2 = new Point(3,1);
        double result = Point.distance(null, point2);
        double expected = 0.0;
        Assertions.assertEquals(expected, result);
    }
}