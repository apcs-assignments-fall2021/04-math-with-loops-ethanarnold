import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {
    @Test
    public void testBabylonian() {
        assertEquals(Math.sqrt(100), MyMain.babylonian(100), 0.01, "The square root of 100 should be: " + Math.sqrt(100));
        assertEquals(Math.sqrt(50.5), MyMain.babylonian(50.5), 0.01, "The square root of 50.5 should be: " + Math.sqrt(50.5));
        assertEquals(Math.sqrt(20.4), MyMain.babylonian(20.4), 0.01, "The square root of 20.4 should be: " + Math.sqrt(20.4));
        assertEquals(Math.sqrt(5.2), MyMain.babylonian(5.2), 0.01, "The square root of 5.2 should be: " + Math.sqrt(5.2));
        assertEquals(Math.sqrt(1192), MyMain.babylonian(1192), 0.01, "The square root of 1192 should be: " + Math.sqrt(1992));
        assertEquals(Math.sqrt(17), MyMain.babylonian(17), 0.01, "The square root of 17 should be: " + Math.sqrt(17));
    }

    @Test
    public void testFactorial() {
        assertEquals(120.0, MyMain.factorial(5), 0.01, "The factorial of 5 should be: 120.0");
        assertEquals(3628800.0, MyMain.factorial(10), 0.01, "The factorial of 10 should be: 3628800.0");
        assertEquals(1.0, MyMain.factorial(1), 0.01, "The factorial of 1 should be: 1.0");
        assertEquals(1.0, MyMain.factorial(0), 0.01, "The factorial of 0 should be: 1.0");
    }

    @Test
    public void testE() {
        assertEquals(Math.E, MyMain.calculateE(), 0.01, "The value of e should be: " + Math.E);
    }


}
