import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsernameCheckTest {

    @Test
    void userNameLength() {
        UsernameCheck object = new UsernameCheck();
        Assert.assertEquals(true, object.UserNameLength("Nichola1738"));
    }

    @Test
    void userNameSymbol() {
        UsernameCheck object = new UsernameCheck();
        Assert.assertEquals(true, object.UserNameSymbol("Nichola1738"));
    }

    @Test
    void isEmptyUsername() {
        UsernameCheck object = new UsernameCheck();
        Assert.assertEquals(false, object.IsEmptyUsername("Nichola1738"));
    }

    @Test
    void totalObjectSelection() {
        UsernameCheck object = new UsernameCheck();
        Assert.assertEquals(true, object.TotalObjectSelection());
    }
}