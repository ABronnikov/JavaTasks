package hightlevel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangeDataTest {

    @Test
    void test0_changeData_ShouldReturnCorrectResult() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 9};
        int[] result = ChangeData.changeData(data);
        int[] expected = {1, 3, 5, 7, 9};
        Assertions.assertArrayEquals(expected,result);
    }

    @Test
    void test1_changeData_ShouldReturnCorrectResult() {
        int[] data = {};
        int[] result = ChangeData.changeData(data);
        int[] expected = {};
        Assertions.assertArrayEquals(expected,result);
    }

    @Test
    void test2_changeDataWithStream_ShouldReturnCorrectResult() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 9};
        int[] result = ChangeData.changeDataWithStream(data);
        int[] expected = {1, 3, 5, 7, 9};
        Assertions.assertArrayEquals(expected,result);
    }

    @Test
    void test3_changeDataWithStream_ShouldReturnCorrectResult() {
        int[] data = {};
        int[] result = ChangeData.changeDataWithStream(data);
        int[] expected = {};
        Assertions.assertArrayEquals(expected,result);
    }
}