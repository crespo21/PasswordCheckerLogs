import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PasswordCheckerTestLog {
    @Test
    public void  exisitingPassword() throws IOException {

        assertEquals("",PasswordCheckerLogs.password_is_valid(""));
    }
    @Test
    public  void passwordLength() throws IOException {
        assertEquals("",
                PasswordCheckerLogs.password_is_valid("abcdefg"));

    }
    @Test
    public  void upperCasePassword() throws IOException {
        assertEquals("",
                PasswordCheckerLogs.password_is_valid("abcdefghi"));
    }
    @Test
    public  void lowerCasePassword() throws IOException {
        assertEquals("",
                PasswordCheckerLogs.password_is_valid("ABCDEFGHI"));
    }
    @Test
    public  void digitPassword() throws IOException {
        assertEquals("",
                PasswordCheckerLogs.password_is_valid("asdfghjkJ"));
    }@Test
    public  void passwordSpecialChar() throws IOException {
        assertEquals("",
                PasswordCheckerLogs.password_is_valid("Asdfghjkt6"));
    }
    @Test
    public  void passwordIsValid() throws IOException {
        assertEquals("",
                PasswordCheckerLogs.password_is_valid("asdfghjkJ9!"));
    }
    @Test
    public  void passwordIsOk() {
        assertEquals(true,
                PasswordCheckerLogs.passwordIsOk("asdfghjkJ9!"));
    }
}
