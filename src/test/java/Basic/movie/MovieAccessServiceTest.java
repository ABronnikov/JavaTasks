package Basic.movie;

import Basic.branchoperators.movie.MovieAccessService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MovieAccessServiceTest {

    @Test
    public void test0ShouldReturnCorrectResult() {
        String result = MovieAccessService.accessMovie(17);
        String expected = "Access is denied.";
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test1ShouldReturnCorrectResult() {
        String result = MovieAccessService.accessMovie(18);
        String expected = "Rating R. Access is allowed.";
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test2ShouldReturnCorrectResult() {
        String result = MovieAccessService.accessMovie(19);
        String expected = "Rating R. Access is allowed.";
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test3ShouldReturnCorrectResult() {
        String result = MovieAccessService.accessMovie(21);
        String expected = "Rating R. Access is allowed.";
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test4ShouldReturnCorrectResult() {
        String result = MovieAccessService.accessMovie(22);
        String expected = "Rating F. Access is allowed.";
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test5ShouldReturnCorrectResult() {
        String result = MovieAccessService.accessMovie(1);
        String expected = "Access is denied.";
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test6ShouldReturnCorrectResult() {
        String result = MovieAccessService.accessMovie(0);
        String expected = "Incorrect age, check the user with this age.";
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test7ShouldReturnCorrectResult() {
        String result = MovieAccessService.accessMovie(-1);
        String expected = "Incorrect age, check the user with this age.";
        Assertions.assertEquals(expected, result);
    }
}