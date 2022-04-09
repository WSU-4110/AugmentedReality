package com.example.augmented_reality_app;

import static org.junit.Assert.assertEquals;

import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private User t = null;

    @Before
    public void setupClass() {
        t = new User();
    }

    @Test
    public void checkAddition() {
        assertEquals(10, t.addition(3, 7));
    }

    @Test
    public void checkSubtraction() {
        assertEquals(3, t.subtraction(10, 7));
    }

    @Test
    public void checkDivision() {
        assertEquals(10, t.division(30, 3));
    }

    @Test
    public void checkMultiplication() {
        assertEquals(25, t.multiplication(5, 5));
    }

    @Test
    public void checkPowerOfTwo() {
        assertEquals(36, t.powerOfTwo(6));
    }

    @Test
    public void checkSquareRoot() {
        assertEquals(5, t.squareRoot(25), .001);
    }



}