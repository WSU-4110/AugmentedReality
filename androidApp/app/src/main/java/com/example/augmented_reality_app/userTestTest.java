import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class userTestTest {

    @org.junit.jupiter.api.Test
    void ageEmptyCheck() {
        userTest object = new userTest();
        Assert.assertEquals(false, object.ageEmptyCheck("10"));
    }

    @org.junit.jupiter.api.Test
    void emailEmptyCheck() {
        userTest object=new userTest();
        Assert.assertEquals(false, object.emailEmptyCheck("notEmpty@gmail.com"));
    }

    @org.junit.jupiter.api.Test
    void isPasswordConfirmed() {
        userTest object=new userTest();
        Assert.assertEquals(true,object.isPasswordConfirmed("password","password"));
    }

    @org.junit.jupiter.api.Test
    void isConfirmedEmptyCheck() {
        userTest object=new userTest();
        Assert.assertEquals(false, object.isConfirmedEmptyCheck("confirmedPassword"));
    }
}