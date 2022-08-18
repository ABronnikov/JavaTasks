package OOP.polymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarDealershipTest {

    @Test
    void shouldReturnEngineTypeCars() {
        Car[] cars = {new Toyota(), new KIA(), new Mazda()};
        CarDealership carDealership = new CarDealership(cars);
        String[] result = new String[3];
        for (int i = 0; i < carDealership.getCars().length; i++) {
            result[i] = carDealership.getCars()[i].getEngineType();
        }
        String[] expected = {"Engine Type Toyota.", "Engine Type KIA.", "Engine Type Mazda."};
        Assertions.assertArrayEquals(expected, result);
    }

}