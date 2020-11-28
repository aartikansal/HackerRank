import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hacker_PasswordRegex {
    public static boolean isValidUsername(String name)
    {
        String regex = "^[A-Za-z]\\w{5,29}$";
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
        // If the username is empty
        // return false
        if (name == null) {
            return false;
       }

        // Pattern class contains matcher() method
        // to find matching between given username
        // and regular expression.
        Matcher m = p.matcher(name);
        return m.matches();
    }
    // Return if the username
    // matched the ReGex
    public static final String regularExpression = null;
}


class Valid {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(Hacker_PasswordRegex.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}