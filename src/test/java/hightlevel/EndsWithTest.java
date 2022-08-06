package hightlevel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static hightlevel.EndsWith.endsWith;

class EndsWithTest {

    @Test
    void test0_EndsWith_ShouldReturnPositiveResult() {
        char[] word = {'П','р','и','в','е','т'};
        char[] post = {'в','е','т'};
        boolean result = endsWith(word, post);
        boolean expected = true;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void test1_EndsWith_ShouldReturnNegativeResult() {
        char[] word = {'П','р','и','в','е','т'};
        char[] post = {'в','у','т'};
        boolean result = endsWith(word, post);
        boolean expected = false;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void test2_EndsWith_ShouldReturnResultWithEmptyArrays() {
        char[] word = {};
        char[] post = {};
        boolean result = endsWith(word, post);
        boolean expected = true;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void test3_EndsWith_ShouldReturnResultWithEmptyArrays() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            char[] word = {'е','т'};
            char[] post = {'в','у','т'};
            endsWith(word, post);
        });
    }
}