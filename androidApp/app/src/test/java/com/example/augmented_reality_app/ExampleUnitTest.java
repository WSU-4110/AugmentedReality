package com.example.augmented_reality_app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void checkAddition() {
        User t = new User();
        assertEquals(10, t.addition(3, 7));
    }

    @Test
    public void checkSubtraction() {
        User t = new User();
        assertEquals(3, t.subtraction(10, 7));
    }

    @Test
    public void checkDivision() {
        User t = new User();
        assertEquals(10, t.division(30, 3));
    }

    @Test
    public void checkMultiplication() {
        User t = new User();
        assertEquals(25, t.multiplication(5, 5));
    }

    @Test
    public void checkPowerOfTwo() {
        User t = new User();
        assertEquals(36, t.powerOfTwo(6));
    }

    @Test
    public void checkSquareRoot() {
        User t = new User();
        assertEquals(5, t.squareRoot(25), .001);
    }



}