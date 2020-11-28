import java.util.Scanner;
import java.lang.*;
    class UsernameValidator {
        public static final String regularExpression ="^[A-Za-z]\\w{5,29}$";
          }
public class Hacker_PasswordRegex {
        private static final Scanner scan = new Scanner(System.in);
        public static void main(String[] args) {
            int n = Integer.parseInt(scan.nextLine());
            while (n-- != 0) {
                String userName = scan.nextLine();

                if (userName.matches(UsernameValidator.regularExpression)) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
            }
        }
    }