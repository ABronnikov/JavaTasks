package basic.classes.auto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AutoServiceTest {

    @Test
    void test0ShouldReturnCorrectResult() {
        Auto auto1 = new Auto("BMW-3", "BMW", "five-seater", "automatic");
        Auto auto2 = new Auto("BMW-5", "BMW", "seven-seater", "mechanical");
        Auto auto3 = new Auto("Mercedes-E", "Mercedes", "two-seater", "automatic");
        Auto auto4 = new Auto("Mercedes-E", "Mercedes", "five-seater", "mechanical");
        Auto auto5 = new Auto("Mercedes-C", "Mercedes", "two-seater", "automatic");
        Auto auto6 = new Auto("Citroen-C4", "Citroen", "five-seater", "mechanical");
        Auto[] autos = {auto1, auto2, auto3, auto4, auto5, auto6};
        Auto[] result = AutoService.getOnlyBmwCars(autos);
        Auto[] expected = {auto1, auto2};
        Assertions.assertArrayEquals(expected,result);

    }

    @Test
    void test1ShouldReturnEmptyArray() {
        Auto auto3 = new Auto("Mercedes-E", "Mercedes", "two-seater", "automatic");
        Auto auto4 = new Auto("Mercedes-E", "Mercedes", "five-seater", "mechanical");
        Auto auto5 = new Auto("Mercedes-C", "Mercedes", "two-seater", "automatic");
        Auto auto6 = new Auto("Citroen-C4", "Citroen", "five-seater", "mechanical");
        Auto[] autos = {auto3, auto4, auto5, auto6};
        Auto[] result = AutoService.getOnlyBmwCars(autos);
        Auto[] expected = {};
        Assertions.assertArrayEquals(expected,result);
    }

    @Test
    void test2ShouldReturnCorrectResult() {
        Auto auto1 = new Auto("BMW-3", "BMW", "five-seater", "automatic");
        Auto auto2 = new Auto("BMW-5", "BMW", "seven-seater", "mechanical");
        Auto auto3 = new Auto("Mercedes-E", "Mercedes", "two-seater", "automatic");
        Auto auto4 = new Auto("Mercedes-E", "Mercedes", "five-seater", "mechanical");
        Auto auto5 = new Auto("Mercedes-C", "Mercedes", "two-seater", "automatic");
        Auto auto6 = new Auto("Citroen-C4", "Citroen", "five-seater", "mechanical");
        Auto[] autos = {auto1, auto2, auto3, auto4, auto5, auto6};
        Auto[] result = AutoService.getOnlyMercedesE(autos);
        Auto[] expected = {auto3, auto4};
        Assertions.assertArrayEquals(expected,result);
    }

    @Test
    void test3ShouldReturnEmptyArray() {
        Auto auto1 = new Auto("BMW-3", "BMW", "five-seater", "automatic");
        Auto auto2 = new Auto("BMW-5", "BMW", "seven-seater", "mechanical");
        Auto auto5 = new Auto("Mercedes-C", "Mercedes", "two-seater", "automatic");
        Auto auto6 = new Auto("Citroen-C4", "Citroen", "five-seater", "mechanical");
        Auto[] autos = {auto1, auto2, auto5, auto6};
        Auto[] result = AutoService.getOnlyMercedesE(autos);
        Auto[] expected = {};
        Assertions.assertArrayEquals(expected,result);
    }

    @Test
    void test4ShouldReturnCorrectResult() {
        Auto auto1 = new Auto("BMW-3", "BMW", "five-seater", "automatic");
        Auto auto2 = new Auto("BMW-5", "BMW", "seven-seater", "mechanical");
        Auto auto3 = new Auto("Mercedes-E", "Mercedes", "two-seater", "automatic");
        Auto auto4 = new Auto("Mercedes-E", "Mercedes", "five-seater", "mechanical");
        Auto auto5 = new Auto("Mercedes-C", "Mercedes", "two-seater", "automatic");
        Auto auto6 = new Auto("Citroen-C4", "Citroen", "five-seater", "mechanical");
        Auto[] autos = {auto1, auto2, auto3, auto4, auto5, auto6};
        Auto[] result = AutoService.getSportCars(autos);
        Auto[] expected = {auto3, auto5};
        Assertions.assertArrayEquals(expected,result);
    }

    @Test
    void test5ShouldReturnEmptyArray() {
        Auto auto1 = new Auto("BMW-3", "BMW", "five-seater", "automatic");
        Auto auto2 = new Auto("BMW-5", "BMW", "seven-seater", "mechanical");
        Auto auto4 = new Auto("Mercedes-E", "Mercedes", "five-seater", "mechanical");
        Auto auto6 = new Auto("Citroen-C4", "Citroen", "five-seater", "mechanical");
        Auto[] autos = {auto1, auto2, auto4, auto6};
        Auto[] result = AutoService.getSportCars(autos);
        Auto[] expected = {};
        Assertions.assertArrayEquals(expected,result);
    }

    @Test
    void test6ShouldReturnCorrectResult() {
        Auto auto1 = new Auto("BMW-3", "BMW", "five-seater", "automatic");
        Auto auto2 = new Auto("BMW-5", "BMW", "seven-seater", "mechanical");
        Auto auto3 = new Auto("Mercedes-E", "Mercedes", "two-seater", "automatic");
        Auto auto4 = new Auto("Mercedes-E", "Mercedes", "five-seater", "mechanical");
        Auto auto5 = new Auto("Mercedes-C", "Mercedes", "two-seater", "automatic");
        Auto auto6 = new Auto("Citroen-C4", "Citroen", "five-seater", "mechanical");
        Auto[] autos = {auto1, auto2, auto3, auto4, auto5, auto6};
        Auto[] result = AutoService.getOnlyAutomaticTypeCars(autos);
        Auto[] expected = {auto1, auto3, auto5};
        Assertions.assertArrayEquals(expected,result);
    }

    @Test
    void test7ShouldReturnEmptyArray() {
        Auto auto2 = new Auto("BMW-5", "BMW", "seven-seater", "mechanical");
        Auto auto4 = new Auto("Mercedes-E", "Mercedes", "five-seater", "mechanical");
        Auto auto6 = new Auto("Citroen-C4", "Citroen", "five-seater", "mechanical");
        Auto[] autos = {auto2, auto4, auto6};
        Auto[] result = AutoService.getOnlyAutomaticTypeCars(autos);
        Auto[] expected = {};
        Assertions.assertArrayEquals(expected,result);
    }
}