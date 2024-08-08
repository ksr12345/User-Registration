import org.example.UserRegistration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @ValueSource(strings = {
            "test.sds@example.co.ij",
            "user.name+tag+sorting@example.com",
            "user.name@example.co.uk",
//            "invalid-email@",
//            "@example.com",
//            "user@.com.my"
    })
    void validEmail (String mail){
        boolean result= UserRegistration.emailValidate(mail);
        Assert.assertEquals(true,result);
    }
}