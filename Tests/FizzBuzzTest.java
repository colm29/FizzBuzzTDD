import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fb = new FizzBuzz();

    @Test
    void testNumberIsReturned() {
        assertTrue(fb.getValue(1).equals("1"));
    }

    @Test
    void testFizzIsReturned() {
        assertTrue(fb.getValue(3) == "Fizz");
    }

    @Test
    void testBuzzIsReturned() {
        assertTrue(fb.getValue(5) == "Buzz");
    }

    @Test
    void testFizzBuzzIsReturned() {
        assertTrue(fb.getValue(15) == "Fizz Buzz");
    }

    @Test
    void testOverallResult() {
        assertEquals(fb.getOverallString(), "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizz Buzz\n");
    }
}