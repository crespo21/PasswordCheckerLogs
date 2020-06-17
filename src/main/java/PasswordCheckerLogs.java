import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;


public class PasswordCheckerLogs {
    private final static Logger LOGGER = LogManager.getLogger(PasswordCheckerLogs.class.getName());

    static boolean passwordExist = true;
    static boolean passwordCharLength = true;
    static boolean passwordLowerCase = true;
    static boolean passwordUpperCase = true;
    static boolean passwordOneDigit = true;
    static boolean passwordOneSpecialChar = true;

    // The method passwordIsValid checks if password is empty,
    // if is less than 8 characters, if it matches Uppercase
    // and lowercase letters,if password matches at least one digit and
    // at least one special character. If not then each conditional
    // statement returns a string type error log message.
    // passwordIsValid method returns the parameter of type String 'password'.
    public static String passwordIsValid(String password) {
        String msg = "";
        if (password.isEmpty()) {
            passwordExist = false;
               LOGGER.error("password should exist");
        }
        else if (password.length() < 8 ){
            passwordCharLength = false;
            LOGGER.error( "password should be longer than 8 characters");
        }
        else if (!password.matches((".*[A-Z].*"))){
            passwordUpperCase = true;
            LOGGER.error("password should have at least one uppercase letter");
        }
        else if (!password.matches((".*[a-z].*"))){
            passwordLowerCase = false;
            LOGGER.error("password should have at least one lowercase letter");
        }
        else if (!password.matches((".*[\\d].*"))){
            passwordOneDigit = false;
            LOGGER.error("password should have at least one digit");
        }
        else if (!password.matches((".*[-!@#$%^&*(){}_\"'\\\\;|?/.>,<:].*"))){
            passwordOneSpecialChar = false;
            LOGGER.error("password should have at least one special character");
        }
        else{
            LOGGER.error("Password is valid!");
        }
        return msg ;
    }

    //passwordIsOk method checks if the given password meets
    //at least three of the conditions or not,
    //password length and password existence being default conditions.
    //The method returns a conditional  feedback
    //called 'passwordIsOkChecker' stating whether
    //passwordIsOk is true or false
    //from the given password.
    public static  boolean passwordIsOk(String password){

        //Declaring a variable to check whether the password is ok or not ok.
        boolean passwordIsOkChecker;

        //checks if the password does not meet at least three of the conditions,
        // if so the variable 'passwordIsOkChecker' is false,
        //else the variable 'passwordIsOkChecker' is true
        //and print out a message to the console stating the condition based on password given,
        if (password.length() == 0 && !password.matches((".*[A-Z].*"))) {
            passwordIsOkChecker = false;
            LOGGER.debug("Password not ok!");
        } else if (!password.matches((".*[a-z].*")) || !password.matches((".*[\\d].*")) || !password.matches((".*[-!@#$%^&*(){}_\"'\\\\;|?/.>,<:].*"))) {
            passwordIsOkChecker = false;
            LOGGER.debug("Password is not ok!");
        } else {
            passwordIsOkChecker = true;
            LOGGER.debug("password is ok!");
        }
        return passwordIsOkChecker;
    }
    public static boolean passwordIsNeverOk(String password) {

        //if password is not greater or equal 8,if password is empty
        //throw a relevant error log message for each condition
        //then return false, else return true
        if (!(password.length() >= 8)) {
            if (password.isEmpty()) {
                LOGGER.error("Empty passwords are invalid!");
            }
            LOGGER.error("Password must be 8 characters long!");
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("(Please Note: Your password shouldn't be empty," +
                "\n must be longer than 8 characters," +
                "\n contains at least one Uppercase,lowercase letter," +
                "\none digit and a special character)");
        System.out.println();
        System.out.println("Please enter your password");
        String userPassword = input.nextLine();
        try {
            LOGGER.debug(passwordIsOk(userPassword));
            LOGGER.error(passwordIsValid(userPassword));
            LOGGER.error(passwordIsNeverOk(userPassword));
        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }

    }
}


