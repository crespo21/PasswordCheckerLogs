import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PasswordCheckerTestLog {
    @Test
    public void existingPassword() {

        assertEquals("",PasswordCheckerLogs.passwordIsValid(""));
    }
    @Test
    public  void passwordLength() {
        assertEquals("",
                PasswordCheckerLogs.passwordIsValid("abcdefg"));

    }
    @Test
    public  void upperCasePassword() {
        assertEquals("",
                PasswordCheckerLogs.passwordIsValid("abcdefghi"));
    }
    @Test
    public  void lowerCasePassword() {
        assertEquals("",
                PasswordCheckerLogs.passwordIsValid("ABCDEFGHI"));
    }
    @Test
    public  void digitPassword() {
        assertEquals("",
                PasswordCheckerLogs.passwordIsValid("asdfghjkJ"));
    }@Test
    public  void passwordSpecialChar() {
        assertEquals("",
                PasswordCheckerLogs.passwordIsValid("Asdfghjkt6"));
    }
    @Test
    public  void passwordIsValid() {
        assertEquals("",
                PasswordCheckerLogs.passwordIsValid("asdfghjkJ9!"));
    }
    @Test
    public  void passwordIsOk() {
        assertTrue(PasswordCheckerLogs.passwordIsOk("asdfghjkJ9!"));
    } @Test
    public  void passwordIsNeverOk() {
        assertTrue(PasswordCheckerLogs.passwordIsNeverOk("asdfghjkJ"));
    }
}
