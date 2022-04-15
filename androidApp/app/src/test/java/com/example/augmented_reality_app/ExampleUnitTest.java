package com.example.augmented_reality_app;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private FirebaseAuth mAuth;


    @Test
    public void testExampleWithCorrectValues() {
        String validEmail = "ali.bilal.said@gmail.com";
        String validPassword = "Hala48127";

        boolean APIrespond = mAuth.signInWithEmailAndPassword(validEmail, validPassword).isSuccessful();

        Assert.assertEquals(true, APIrespond);

    }
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    }
