package hightlevel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EndsWithTest {

    @Test
    public void test0_EndsWith_ShouldReturnPositiveResult() {
        char[] word = {'П','р','и','в','е','т'};
        char[] post = {'в','е','т'};
        boolean result = EndsWith.endsWith(word, post);
        boolean expected = true;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test1_EndsWith_ShouldReturnNegativeResult() {
        char[] word = {'П','р','и','в','е','т'};
        char[] post = {'в','у','т'};
        boolean result = EndsWith.endsWith(word, post);
        boolean expected = false;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test2_EndsWith_ShouldReturnResultWithEmptyArrays() {
        char[] word = {};
        char[] post = {};
        boolean result = EndsWith.endsWith(word, post);
        boolean expected = true;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test3_EndsWith_ShouldReturnResultWithEmptyArrays() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            char[] word = {'е','т'};
            char[] post = {'в','у','т'};
            EndsWith.endsWith(word, post);
        });
    }
}