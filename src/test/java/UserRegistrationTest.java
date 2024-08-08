import org.example.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void fnameTest(){
        boolean result=UserRegistration.fNameValidate("Kaustubh");
        Assert.assertEquals(true,result);
    }
    @Test
    public void lnameTest(){
        boolean result=UserRegistration.lNameValidate("Raut");
        Assert.assertEquals(true,result);
    }

    @Test
    public void emailTest(){
        boolean result=UserRegistration.emailValidate("abc.xyz@bl.co.in");
        Assert.assertEquals(true,result);
    }

    @Test
    public void phoneNumberTest(){
        boolean result=UserRegistration.phoneNumberValidate("91 9869167901");
        Assert.assertEquals(true,result);
    }
    @Test
    public void passwordTest(){
        boolean result=UserRegistration.passwordValidate("Aabc123$^%:{}");
        Assert.assertEquals(true,result);
    }


}