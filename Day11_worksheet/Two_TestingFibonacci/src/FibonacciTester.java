import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTester {

    @Test
    public void testIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    FibonacciTry1 fib = new FibonacciTry1();
                    fib.fib(-10);
                });
    }

    @Test
    public void testEqualToZero() {
        FibonacciTry1 fib = new FibonacciTry1();
        long expected = 0;
        long actual = fib.fib(0);
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualToOne() {
        FibonacciTry1 fib = new FibonacciTry1();
        long expected = 1;
        long actual = fib.fib(1);
        assertEquals(expected, actual);
    }

    @Test
    public void testFib() {
        assertTimeoutPreemptively(Duration.ofMillis(1000),
                () -> {
                    FibonacciTry1 fib = new FibonacciTry1();
                    long expected = 1836311903;
                    long actual = fib.fib(46);
                });
    }

    @Test
    public void testFib2() {
        assertTimeout(Duration.ofMillis(1000),
                () -> {
                    FibonacciTry1 fib = new FibonacciTry1();
                    long expected = 1836311903;
                    long actual = fib.fib(46);
                });
    }

}
