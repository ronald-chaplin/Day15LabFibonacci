import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    Fibonacci fibonacci;

    @Test
    void fibTest(){
        long expected = 6765l;
        long actual = fibonacci.fib(20);
        assertEquals(expected, actual);
    }

    @Test
    void fibTest2(){
        long expected = -1l;
        long actual = fibonacci.fib(6);
        assertEquals(expected, actual);
    }

}
