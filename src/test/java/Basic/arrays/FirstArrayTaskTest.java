package Basic.arrays;

import Basic.arrays.FirstArrayTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstArrayTaskTest {

    @Test
    public void firstTest() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int result = FirstArrayTask.getCountEvenNumbers(numbers);
        int expected = 3;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void secondTest() {
        int[] numbers = {1, 22, 31, 51, 83, 24};
        int result = FirstArrayTask.getCountEvenNumbers(numbers);
        int expected = 2;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void thirdTest() {
        int[] numbers = {6};
        int result = FirstArrayTask.getCountEvenNumbers(numbers);
        int expected = 1;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void fourthTest() {
        int[] numbers = {};
        int result = FirstArrayTask.getCountEvenNumbers(numbers);
        int expected = 0;
        Assertions.assertEquals(expected,result);
    }

}