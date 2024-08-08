import org.example.UserRegistration;
import org.example.CustomException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserRegistrationTest {
    @Test
    public void fnameTest(){
        try {
            Assert.assertEquals(true, UserRegistration.fNameValidate("Kaustubh"));
        } catch (CustomException e) {
            Assert.fail("Exception should not have been thrown");
        }
    }

    @Test
    public void invalidFirstNameTest() {
        try {
            UserRegistration.fNameValidate("kaustubh"); // Invalid last name
            Assert.fail("Expected CustomException not thrown");
        } catch (CustomException e) {
            Assert.assertEquals("Invalid First name", e.getMessage());
        }
    }

    @Test
    public void lnameTest(){
        try {
            Assert.assertEquals(true, UserRegistration.lNameValidate("Raut"));
        } catch (CustomException e) {
            Assert.fail("Exception should not have been thrown");
        }
    }

    @Test
    public void invalidLastNameTest() {
        try {
            UserRegistration.lNameValidate("raut"); // Invalid last name
            Assert.fail("Expected CustomException not thrown");
        } catch (CustomException e) {
            Assert.assertEquals("Invalid last name", e.getMessage());
        }
    }

    @Test
    public void emailTest(){
        try {
            Assert.assertEquals(true, UserRegistration.emailValidate("abc.xyz@bl.co.in"));
        } catch (CustomException e) {
            Assert.fail("Exception should not have been thrown");
        }
    }

    @Test
    public void phoneNumberTest(){
        try {
            Assert.assertEquals(true, UserRegistration.phoneNumberValidate("91 9869167901"));
        } catch (CustomException e) {
            Assert.fail("Exception should not have been thrown");
        }
    }

    @Test
    public void invalidPhoneNumberTest()
    {
        try {
            UserRegistration.phoneNumberValidate("91 1234");
            Assert.fail("Exception should not have been thrown");
        }
        catch(CustomException e) {
            Assert.assertEquals("Invalid Phone number", e.getMessage());
        }
    }

    @Test
    public void passwordTest(){
        try {
            Assert.assertEquals(true, UserRegistration.passwordValidate("Aabcd123$%[]:"));
        } catch (CustomException e) {
            Assert.fail("Exception should not have been thrown");
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "test.sds@example.co.ij",
            "user.name+tag+sorting@example.com",
            "user.name@example.co.uk"
    })
    void validEmail(String mail) {
        try {
            Assert.assertEquals(true, UserRegistration.emailValidate(mail));
        } catch (CustomException e) {
            Assert.fail("Exception should not have been thrown");
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "invalid-email@",
            "@example.com",
            "user@.com.my"
    })
    void invalidEmail(String mail) {
        try {
            UserRegistration.emailValidate(mail); // Invalid email
            Assert.fail("Expected CustomException not thrown");
        } catch (CustomException e) {
            Assert.assertEquals("Invalid email", e.getMessage());
        }
    }
}