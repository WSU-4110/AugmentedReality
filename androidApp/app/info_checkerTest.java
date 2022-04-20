package com.example.augmented_reality_app;

import org.junit.Assert;
import org.junit.Test;





import static org.junit.Assert.*;



/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class info_checkerTest {

    @Test
    public void passwordlengthcheck() {
        info_checker obj = new info_checker();


        Assert.assertEquals(false,obj.passwordlengthcheck("alis21"));
    }
    @Test
    public void PasswordEmptyCheck() {
        info_checker obj = new info_checker();


        Assert.assertEquals(true,obj.PasswordEmptyCheck(""));
    }
    @Test
    public void emaillengthcheck() {
        info_checker obj = new info_checker();


        Assert.assertEquals(true,obj.emaillengthcheck("alisaid21@gmail.com"));
    }
    @Test
    public void agecheck() {
        info_checker obj = new info_checker();


        Assert.assertEquals(false,obj.agecheck("-5"));
    }
    @Test
    public void agecheck2() {
        info_checker obj = new info_checker();


        Assert.assertEquals(false,obj.agecheck("1500"));
    }

    @Test
    public void EmailCheck() {
        info_checker obj = new info_checker();


        Assert.assertEquals(false,obj.EmailCheck("alisaidgmail.com"));
    }







    /**
     * Example local unit test, which will execute on the development machine (host).
     *
     * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
     */








}