import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
import java.util.logging.*;

public class PasswordCheckerLogs {
    private final static Logger LOGGER = LogManager.getLogger(PasswordCheckerLogs.class.getName());

    static boolean passwordExist = true;
    static boolean passwordCharLength = true;
    static boolean passwordLowerCase = true;
    static boolean passwordUpperCase = true;
    static boolean passwordOneDigit = true;
    static boolean passwordOneSpecialChar = true;

    public static String password_is_valid(String password) {
        String msg = "";
        if (password.isEmpty()) {
            passwordExist = false;
            msg = "password should exist";
        }
        else if (password.length() < 8 ){
            passwordCharLength = false;
            msg = "password should be longer than 8 characters";
        }
        else if (!password.matches((".*[A-Z].*"))){
            passwordUpperCase = true;
            msg="password should have at least one uppercase letter";
        }
        else if (!password.matches((".*[a-z].*"))){
            passwordLowerCase = false;
            msg="password should have at least one lowercase letter";
        }
        else if (!password.matches((".*[\\d].*"))){
            passwordOneDigit = false;
            msg="password should have at least one digit";
        }
        else if (!password.matches((".*[-!@#$%^&*(){}_\"\"';|?/.>,<:].*"))){
            passwordOneSpecialChar = false;
            msg="password should have at least one special character";
        }
        else{
            msg="Password is valid!";
        }
        return msg ;
    }
    public static  boolean passwordIsOk(String password){
        boolean check;
        if(!password.isEmpty() && password.length() >= 8 && password.matches((".*[A-Z].*")) ){

            LOGGER.debug("Password is Ok!");
            check =true;
        } else{
            LOGGER.debug("password is not ok,");
            check = false;
        }
        return check;
    }
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.println("(Please Note: Your password shouldn't be empty," +
                "\n must be longer than 8 characters," +
                "\n contains at least one Uppercase,lowercase letter," +
                "\none digit and a special character(one of these :\"&%^4\").)");
        System.out.println("");
        System.out.println("Please enter your password");
        String userPassword = input.nextLine();
        try {
            System.out.println(password_is_valid(userPassword));
            System.out.println(passwordIsOk(userPassword));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
//        LogManager.getLogManager().reset();
//        LOGGER.setLevel(Level.SEVERE);
//        ConsoleHandler ch = new ConsoleHandler();
//        LOGGER.addHandler(ch);
//
//        LOGGER.setLevel(Level.FINE);
//        FileHandler fh = new   FileHandler("passwordLog.log");
//        LOGGER.addHandler(fh);
//
//        LOGGER.info("Password should exist");

//
    }
}


