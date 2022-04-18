import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class user_info_checkerTest {

    @Test
    void passwordSymbolChecker()
    {
        user_info_checker object = new user_info_checker();
        Assert.assertEquals(true, object.password("jun1223"));
    }

    @Test
    void totalCostAddition()
    {
        user_info_checker object = new user_info_checker();
        Assert.assertEquals(true, object.totalCostAddition());
    }


    @Test
    void userObjectSelection()
    {
        user_info_checker object = new user_info_checker();
        Assert.assertEquals(true, object.userObjectSelection("Chair"));
    }

    @Test
    void searchBarLength()
    {
        user_info_checker object = new user_info_checker();
        Assert.assertEquals(false, object.searchBarLength("This is going to be over the max!"));
    }
}