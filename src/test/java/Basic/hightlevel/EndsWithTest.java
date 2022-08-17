package Basic.hightlevel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static Basic.hightlevel.EndsWith.endsWith;

class EndsWithTest {

    @Test
    void shouldReturnPositiveResult() {
        char[] word = {'П','р','и','в','е','т'};
        char[] post = {'в','е','т'};
        boolean result = endsWith(word, post);
        Assertions.assertTrue(result);
    }

    @Test
    void shouldReturnNegativeResult() {
        char[] word = {'П','р','и','в','е','т'};
        char[] post = {'в','у','т'};
        boolean result = endsWith(word, post);
        Assertions.assertFalse(result);
    }

    @Test
    void shouldReturnResultWithAllEmptyArrays() {
        char[] word = {};
        char[] post = {};
        boolean result = endsWith(word, post);
        Assertions.assertFalse(result);
    }

    @Test
    void shouldReturnResultWithOneEmptyArrays() {
        char[] word = {'п'};
        char[] post = {};
        boolean result = endsWith(word, post);
        Assertions.assertFalse(result);
    }

    @Test
    void test4_EndsWith_ShouldReturnResultWithEmptyArrays() {
        char[] word = {};
        char[] post = {'п'};
        boolean result = endsWith(word, post);
        Assertions.assertFalse(result);
    }
}