package Basic.arrays;

import Basic.arrays.SecondArrayTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SecondArrayTaskTest {

    @Test
    public void firstTest() {
        int result = SecondArrayTask.fullSize(new int[5], new int[11]);
        int expected = 16;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void secondTest() {
        int result = SecondArrayTask.fullSize(new int[0], new int[11]);
        int expected = 11;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void thirdTest() {
        int result = SecondArrayTask.fullSize(new int[0], new int[0]);
        int expected = 0;
        Assertions.assertEquals(expected, result);
    }

}