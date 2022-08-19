package basic.hightlevel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChangeDataTest {

    @Test
    void shouldReturnCorrectResult() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 9};
        int[] result = ChangeData.changeData(data);
        int[] expected = {1, 3, 5, 7, 9};
        Assertions.assertArrayEquals(expected,result);
    }

    @Test
    void shouldReturnCorrectResultWithEmptyArray() {
        int[] data = {};
        int[] result = ChangeData.changeData(data);
        int[] expected = {};
        Assertions.assertArrayEquals(expected,result);
    }

    @Test
    void shouldReturnCorrectResultWithStream() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 9};
        int[] result = ChangeData.changeDataWithStream(data);
        int[] expected = {1, 3, 5, 7, 9};
        Assertions.assertArrayEquals(expected,result);
    }

    @Test
    void shouldReturnCorrectResultWithStreamWithEmptyArray() {
        int[] data = {};
        int[] result = ChangeData.changeDataWithStream(data);
        int[] expected = {};
        Assertions.assertArrayEquals(expected,result);
    }
}