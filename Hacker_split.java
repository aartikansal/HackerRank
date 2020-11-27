

import java.util.Scanner;
import java.util.regex.*;
public class Hacker_split {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        String[] splitString = (s.replaceAll("^[\\W+\\s+]", "").split("[\\s!,?._'@]+"));
        System.out.println(splitString.length);
        for (String string : splitString) {
            System.out.println(string);
        }
    }
}

