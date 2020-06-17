import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PasswordCheckerTestLog {
    @Test
    public void  exisitingPassword() throws IOException {

        assertEquals("",PasswordCheckerLogs.passwordIsValid(""));
    }
    @Test
    public  void passwordLength() throws IOException {
        assertEquals("",
                PasswordCheckerLogs.passwordIsValid("abcdefg"));

    }
    @Test
    public  void upperCasePassword() throws IOException {
        assertEquals("",
                PasswordCheckerLogs.passwordIsValid("abcdefghi"));
    }
    @Test
    public  void lowerCasePassword() throws IOException {
        assertEquals("",
                PasswordCheckerLogs.passwordIsValid("ABCDEFGHI"));
    }
    @Test
    public  void digitPassword() throws IOException {
        assertEquals("",
                PasswordCheckerLogs.passwordIsValid("asdfghjkJ"));
    }@Test
    public  void passwordSpecialChar() throws IOException {
        assertEquals("",
                PasswordCheckerLogs.passwordIsValid("Asdfghjkt6"));
    }
    @Test
    public  void passwordIsValid() throws IOException {
        assertEquals("",
                PasswordCheckerLogs.passwordIsValid("asdfghjkJ9!"));
    }
    @Test
    public  void passwordIsOk() {
        assertEquals(true,
                PasswordCheckerLogs.passwordIsOk("asdfghjkJ9!"));
    }
}
