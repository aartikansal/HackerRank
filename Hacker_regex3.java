
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class Hacker_regex3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex {
    String pattern;
    MyRegex() {
        String zeroTo255 ="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;

    }
}

//000.12.12.034
//121.234.12.12
//23.45.12.56
//00.12.123.123123.123
//122.23
//Hello.IP
/*true
        true
        false
        false*/