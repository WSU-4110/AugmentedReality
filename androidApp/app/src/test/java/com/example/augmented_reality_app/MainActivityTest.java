package com.example.augmented_reality_app;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;



import com.google.firebase.auth.FirebaseAuth;


class MainActivityTest {

    private FirebaseAuth mAuth;


    @Test
    public void testExampleWithCorrectValues() {
        String validEmail = "email";
        String validPassword = "password";

        boolean APIrespond = mAuth.signInWithEmailAndPassword(validEmail, validPassword).isSuccessful();

        Assert.assertEquals(true, APIrespond);

    }







}